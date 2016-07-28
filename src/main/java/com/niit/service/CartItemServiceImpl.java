package com.niit.service;

import com.niit.dao.CartItemDao;
import com.niit.model.Cart;
import com.niit.model.CartItem;
import com.niit.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CartItemServiceImpl implements CartItemService{

    @Autowired
    private CartItemDao cartItemDao;

    public void addCartItem(CartItem cartItem) {
    	System.out.println("Hello CartItemServiceImpl");
        cartItemDao.addCartItem(cartItem);
    }

    public void removeCartItem(CartItem cartItem) {
        cartItemDao.removeCartItem(cartItem);
    }

    public void removeAllCartItems(Cart cart){
        cartItemDao.removeAllCartItems(cart);
    }

    public CartItem getCartItemByItemId (int itemId) {
        return cartItemDao.getCartItemByItemId(itemId);
    }
}
