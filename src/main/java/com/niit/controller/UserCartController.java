package com.niit.controller;

import com.niit.model.UsersDetail;
import com.niit.service.UsersDetailService;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


/*
 * This controller is called when user clicks on cart menu or button
 */
@Controller
@RequestMapping("/user/cart")
public class UserCartController {

    @Autowired
    private UsersDetailService usersDetailService;
    
    /*
     * Initially getCart method is called to get user card items from database
     */
    @RequestMapping
    public String getCartItems(Principal activeUser){
    	System.out.println("Hello User Cart Controller");
    	System.out.println(activeUser.getName());
    	UsersDetail usersDetail = usersDetailService.getUserByUsername (activeUser.getName());
        int cartId = usersDetail.getCart().getCartId();
        System.out.println("cart Id==="+cartId);
        return "redirect:/user/cart/"+cartId;
    }
    /*
     * getCartRedirect method is called from getCart method to set retrieved cart from the database.
     */
    @RequestMapping("/{cartId}")
    public String getNewUrl(@PathVariable (value = "cartId") int cartId, Model model) {
    	System.out.println("hello user Cart Controller func 2==="+cartId);
        model.addAttribute("cartId", cartId);

        return "cart";
    }

}
