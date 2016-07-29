<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%@include file="/WEB-INF/views/common.jsp"%>
<script src="<c:url value="/resources/js/ordercontroller.js" /> "></script>

<div class="span9 margin-bottom center"> 
					<h3>Items in your cart</h3>
					</div>
<div class="span9 margin-left10" data-ng-app="addToCartApp">
	 
	 <div class="row margin-left25" data-ng-controller = "addToCartCtrl" data-ng-init="retrieveCart('${cartId}')">
        <table class="table table-bordered table-striped fs13" >
		  <thead>
			  <tr>
				
				<th>Image</th>
				<th class="width110">Product</th>
				<th >Unit Price</th>
				<th>Quantity</th>
				<th>Price(in Rs.)</th>
				<th>Action</th>
			  </tr>
			</thead>
			<tbody>
				<tr data-ng-repeat = "items in cart.cartItems">
					 	<td class="span1"><img src="<c:url value="/resources/images/{{items.item.itemId}}.png" /> " alt="image"/></td>
						<td>{{items.item.itemId}}</td>
						<td>{{items.item.itemName}}</td>
						<td>{{items.item.itemPrice}}</td>
						<td>{{items.Quantity}}</td>
						<td>{{items.totalPrice}}</td>
						<td><a href="#" class="btn btn-danger btnAction" data-ng-click="removeItemFromCart(items.item.itemId)">
							<span class="glyphicon glyphicon-remove"></span>remove</a></td>
					</tr>
			  <tr>
                    <td>{{items.item.itemName}}</td>
                    <td></td>
					<td></td>
                    <td>{{cartItem.getQuantity()}}</td>
                    <td>{{GrandTotalOfItems()}}</td>
                    <td></th>
                </tr>	  
			</tbody>
		  </table>
		  
		  

          <div class="row">
		  <div class="span3">
             <a href="<spring:url value="/" />" class="btn btn-info center">Continue Shopping</a>
			</div>	
			<div class="span3">
             <a href="<spring:url value="/order/${cartId}"/>"
                   class="btn btn-success center"><span class="glyphicon-shopping-cart glyphicon"></span> Check out
                </a>
			</div>	  
			<div class="span2">
           <a class="btn btn-danger center" data-ng-click="clearCartItems()"><span
                        class="glyphicon glyphicon-remove-sign"></span>Clear Cart</a>
			</div>		  
			
        </div>
		</div>
      </div>     



