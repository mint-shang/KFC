import java.util.Scanner;

public class Client {
	public static void main(String args[]){
		MealBuilder mb=(MealBuilder)XMLUtil.getBean();
		KFCWaiter waiter=new KFCWaiter();
		waiter.setMealBuilder(mb);
		Meal meal=waiter.construct();
		
		Scanner sc=new  Scanner(System.in);
		String food=sc.next();
		String drink=sc.next();
		System.out.println("套餐组成：");
		System.out.println(meal.getFood(food));
		System.out.println(meal.getDrink(drink));
	}
}
