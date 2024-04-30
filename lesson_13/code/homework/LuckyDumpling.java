package homework;
/*Хозяйка налепила для гостей 30 пельменей. В один из пельменей она положила монету, которая
увеличивает вес пельменя на 15 грамм.Напишите программу, которая ищет счастливый пельмень.*/

public class LuckyDumpling {
    public static void main(String[] args) {
        int [] dumplingWeights = new int [30]; // we create an array to store the weights of the dumplings in

        // Fill the array with weights for the dumplings using Math.random()
        int minWeight = 50;
        int maxWeight = 200;
        for (int i = 0; i < dumplingWeights.length; i++) {
            // Calculate weight using Math.random()
            int weight = (int)(minWeight + Math.random() * (maxWeight - minWeight + 1));
            dumplingWeights[i] = weight;
        }
        // now we must find the index of the lucky dumpling
        int luckyIndex = (int) (Math.random() * dumplingWeights.length);
        dumplingWeights[luckyIndex] += 15; // we increase the weight by 15 grams
        System.out.println(" Congrats! You found lucky dumpling " + (luckyIndex + 1) +
                " and his weight is " + dumplingWeights [luckyIndex] + " grams");
    }
}
