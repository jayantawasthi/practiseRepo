//import java.lang.reflect.Array;
//import java.util.*;
//import java.util.logging.Filter;
//import java.util.stream.Collector;
//import java.util.stream.Collectors;
//import java.util.stream.DoubleStream;
//
//public class BillPaying_System {
//    public static void main(String[] args) {
//
////        Scanner scanner = new Scanner(System.in);
////
////        System.out.println("Enter number friends you are?");
////        int totalFriends = scanner.nextInt();
////
////        System.out.println("Enter total bill amount you paid?");
////        Double totalBill = scanner.nextDouble();
////
////        Double averageBillPerFriend = totalBill / totalFriends;
////
////        double[] friend = new double[totalFriends];
////        HashMap<String, Double> hashMap = new HashMap<String, Double>();
////
////        for (int i = 1; i <= totalFriends; i++) {
////            System.out.println("Enter your name ");
////            String name = scanner.next();
////
////            System.out.println("Enter total bill you pay");
////            double bill = scanner.nextFloat();
////
////            hashMap.put(name, bill);
////        }
////
////        scanner.close();
////
////        hashMap.values().stream().filter(aDouble -> aDouble>averageBillPerFriend);
//
//
//        import java.util.ArrayList;
//import java.util.Scanner;
//
//        public class BillManage {
//            //set total bill amount
//            private final Long totalBil;
//            // total friends and amount they need to paid
//            private final ArrayList<String> friendsName = new ArrayList<>();
//            //for amount paid
//            private final ArrayList<Long> amountPaid = new ArrayList<>();
//            private int totalFriends;
//            // to store amount nature either paid ot get
//            private long[] amountNature;
//            //store average amount for bill
//            Long baseAmountForPaid;
//
//            //now set above value form constructor
//            public BillManage() {
//                Scanner scanner = new Scanner(System.in);
//                //get total bill amount
//                System.out.print("Enter total bill amount: ");
//                totalBil = scanner.nextLong();
//
//                //set friends name and amount they paid
//                System.out.print("Total friends: ");
//                totalFriends = scanner.nextInt();
//                amountNature = new long[totalFriends];
//                scanner.nextLine(); //stop skipping
//                for (int i = 0; i < totalFriends; i++) {
//                    System.out.print("Enter Name: ");
//                    String name = scanner.nextLine();
//                    friendsName.add(name);
//                    System.out.print("Amount paid: ");
//                    Long amount = scanner.nextLong();
//                    amountPaid.add(amount);
//                    scanner.nextLine();
//                }
//                //set amount nature either paid or get
//                setAmountNature();
//            }
//
//            public static void main(String[] args) {
//                BillManage billManage = new BillManage();
//                billManage.printShouldPaid();
//            }
//
//            public void setAmountNature() {
//                baseAmountForPaid = totalBil / totalFriends;
//                for (int i = 0; i < amountPaid.size(); i++) {
//                    Long amount = amountPaid.get(i) - baseAmountForPaid;
//                    amountNature[i] = amount;
//                }
//            }
//
//            //check he/she is receiver or not
//            private boolean isReceiver(Long amount) {
//                return amount > 0;
//            }
//
//            //check he/she is giver or not
//            private boolean isGiver(Long amount) {
//                return amount < 0;
//            }
//
//            public void printShouldPaid() {
//                //access the amountNature
//                for (int i = 0; i < totalFriends; i++) { // i for receiver
//                    //find receiver
//                    Long receiverAmount = amountNature[i];
//                    if (isReceiver(receiverAmount)) { //if he is receiver
//                        //then find giver
//                        for (int j = 0; j < totalFriends; j++) { //j for giver
//                            Long giverAmount = amountNature[j];
//                            // check he is giver or not
//                            if (isGiver(giverAmount)) {
//                                if (receiverAmount <= Math.abs(giverAmount)) {
//                                    System.out.println(friendsName.get(j) + " should paid " + amountNature[i] + " to " + friendsName.get(i));
//                                    // reduce both receiver amount and giver amount
//                                    amountNature[i] = 0L; //fully get so now not receiver
//                                    amountNature[j] = receiverAmount - Math.abs(giverAmount); //certain amount remain to paid
//                                    break; //search for another giver
//                                } else { // receiver amount > giver amount
//                                    System.out.println(friendsName.get(j) + " should paid " + Math.abs(giverAmount) + " to " + friendsName.get(i));
//                                    //reduce paid and get amount
//                                    amountNature[j] = 0L; //fully paid so it is not giver
//                                    amountNature[i] -= Math.abs(giverAmount); //certain amount left to receive
//                                }
//                            }
//                        }
//                    }
//                }
//
//            }
//        }
//    }
//
//}
