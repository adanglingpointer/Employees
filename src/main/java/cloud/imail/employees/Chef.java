package cloud.imail.employees;

public interface Chef {

    String favoriteFood = "hamburger";

    default void cook(String food) {
        System.out.println("I am now cooking " + food);
    }

    default String cleanUp() {
        return "I'm done cleaning up";
    }

    default String getFavoriteFood() {
        return favoriteFood;
    }

//    Interfaces can not hold any state
//    default void setFavoriteFood(String favoriteFood) {
//        this.favoriteFood = favoriteFood;
//    }



}
