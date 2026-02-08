public class SalesAddition {
public static void main(String[] args) {
int[] branchA = {12000, 15000, 18000, 20000};
int[] branchB = {10000, 14000, 16000, 19000};
int[] totalSales = new int[branchA.length];
System.out.println("Total monthly sales:");
for (int i = 0; i < branchA.length; i++) {
totalSales[i] = branchA[i] + branchB[i];
System.out.println("Month " + (i + 1) + ": " + totalSales[i]);
}
}
}