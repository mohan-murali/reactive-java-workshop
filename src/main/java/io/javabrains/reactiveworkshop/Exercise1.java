package io.javabrains.reactiveworkshop;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        // TODO: Write code here
//        StreamSources.intNumbersStream().forEach(x -> System.out.println(x));

        // Print numbers from intNumbersStream that are less than 5
        // TODO: Write code here
//        StreamSources.intNumbersStream().filter(x -> x < 5).forEach(x -> System.out.println(x));

        // Print the second and third numbers in intNumbersStream that's greater than 5
        // TODO: Write code here
//        StreamSources.intNumbersStream().filter(x -> x > 5).limit(2).forEach(x -> System.out.println(x));

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        // TODO: Write code here
//        var number = StreamSources.intNumbersStream().filter(x -> x > 5).findFirst();
//        if (number.isPresent()) {
//            System.out.println(number.get());
//        } else {
//            System.out.println(-1);
//        }

        // Print first names of all users in userStream
        // TODO: Write code here
        // StreamSources.userStream().forEach(x -> System.out.println(x.getFirstName()));

        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here
        StreamSources.userStream()
                .filter(x -> StreamSources.intNumbersStream()
                        .filter(y -> x.getId() == y)
                        .findAny()
                        .isPresent()).forEach(x -> System.out.println(x.getFirstName()));

    }

}
