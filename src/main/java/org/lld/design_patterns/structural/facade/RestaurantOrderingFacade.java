package org.lld.design_patterns.structural.facade;

public class RestaurantOrderingFacade {

    /**
     * FACADE DESIGN PATTERN
     * We use this pattern to hide complexity as well as duplicacy of code
     *
     * Eg:- if you have functionality to perform same task multiple times in same order. Then we can create facade and perform them in one method, and use that method.
     */

    private Object orderFoodItem(String foodItem) {
        /**
         *
         * Dish dish = Helper.getWashedDish();
         * if(Cook.checkIfFoodItemsAvailable()){
         *    Food food = Cook.cookFood();
         *    Cook.decorateFoodItem(Dish, food);
         *    return Dish;
         * }
         */
        return null;// returning required object.
    }
}
