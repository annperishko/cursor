public class Main {

    public static void main(String[] args) {
//Task 1
        Circle circle = new Circle(4);
        double area = circle.getArea();

        System.out.println("1. Circle area = " + area);

//Task 2
        CountObj firstObj = new CountObj();
        CountObj secondObj = new CountObj();

        System.out.println("2. Created objects = " + CountObj.count);

//Task 3
        System.out.println("3. Car info: ");
        Car car = new Car(200);

        car.startEngine();
        car.setSpeed(50);
        car.stopEngine();
        car.setSpeed(0);
        car.stopEngine();

//Task 4
        Fractions firstFraction = new Fractions(20, (short) 15);
        Fractions secondFraction = new Fractions(10, (short) 15);

        System.out.println("4. Fractions");

        System.out.print("Sum: ");
        Fractions resFraction = firstFraction.sum(secondFraction);
        System.out.println(resFraction.toString());

        System.out.print("Difference: ");
        resFraction = firstFraction.subtraction(secondFraction);
        System.out.println(resFraction.toString());

        System.out.print("Share: ");
        resFraction = firstFraction.division(secondFraction);
        System.out.println(resFraction.toString());

        System.out.print("Product: ");
        resFraction = firstFraction.multiplication(secondFraction);
        System.out.println(resFraction.toString());


//Task 5
        Money firstMoney = new Money(15, (byte) 50);
        Money secondMoney = new Money(15, (byte) 50);


        System.out.println("5. Money: ");


        System.out.print("Sum: ");
        Money resultMoney = firstMoney.sum(secondMoney);
        System.out.println(resultMoney.toString());

        System.out.print("Difference: ");
        resultMoney = firstMoney.subtraction(secondMoney);
        System.out.println(resultMoney.toString());

        System.out.print("Division: ");
        resultMoney = firstMoney.divisionOfSums(secondMoney);
        System.out.println(resultMoney.toString());

        System.out.print("The share of division into fractional expressions: ");
        resultMoney = firstMoney.divByFraction(2.1f);
        System.out.println(resultMoney.toString());

        System.out.print("The product of multiplication by a number: ");
        resultMoney = firstMoney.multiplicationByNum(3.7f);
        System.out.println(resultMoney.toString());

        System.out.print("Сomparison: ");
        boolean result = firstMoney.equals(secondMoney);

        System.out.println(result);


    }


}
