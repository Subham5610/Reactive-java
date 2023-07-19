package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise7 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

        // Print all values from intNumbersFlux that's greater than 5
        ReactiveSources.intNumbersFlux()
                .log()
                .filter(integer -> integer > 5)
                .subscribe(number -> System.out.println(number));

        // Print 10 times each value from intNumbersFlux that's greater than 5
        ReactiveSources.intNumbersFlux()
                .log()
                .filter(integer -> integer > 5)
                .subscribe(number -> System.out.println(number * 10));

        // Print 10 times each value from intNumbersFlux for the first 3 numbers emitted that's greater than 5
        // TODO: Write code here
        ReactiveSources.intNumbersFlux()
                .log()
                .filter(integer -> integer > 5)
                .take(3)
                .subscribe(number -> System.out.println(number * 10));

        // Print each value from intNumbersFlux that's greater than 20. Print -1 if no elements are found
        ReactiveSources.intNumbersFlux()
                .log()
                .filter(integer -> integer > 5)
                .defaultIfEmpty()
                .subscribe(number -> System.out.println(number));

        // Switch ints from intNumbersFlux to the right user from userFlux
        // TODO: Write code here
        

        // Print only distinct numbers from intNumbersFluxWithRepeat
        // TODO: Write code here

        // Print from intNumbersFluxWithRepeat excluding immediately repeating numbers
        // TODO: Write code here

        System.out.println("Press a key to end");
        System.in.read();
    }

}
