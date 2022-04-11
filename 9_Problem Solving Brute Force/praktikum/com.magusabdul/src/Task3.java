import java.io.*;
import java.util.*;

public class Task3 { 
    public static void main(String[] args) throws NumberFormatException, IOException {
        Task3 m = new Task3();
        m.process();
       
        System.exit(0);
    }
    public void process() throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numHeads = sc.nextInt();
        int numKnights = sc.nextInt();
        while (numHeads != 0 || numKnights != 0) {
            int[] heads = new int[numHeads];
            int[] knightsHeights = new int[numKnights];
            for (int i = 0; i < numHeads; i++) {
                heads[i] = sc.nextInt();
            }
            for (int i = 0; i < numKnights; i++) {
                knightsHeights[i] = sc.nextInt();
            }
            Arrays.sort(heads);
            Arrays.sort(knightsHeights);
           
            int gold = 0;
            int cut = 0;
            int indexH = 0;
            for (int i = 0; i < numKnights; i++) {
                if (knightsHeights[i] < heads[indexH]) {
                    continue;
                }
                cut++;
                gold += knightsHeights[i];
                indexH++;
                if (indexH >= numHeads) {
                    break;
                }
            }
           
            if (cut == numHeads) {
                bw.write(gold+"\n");
            } else {
                bw.write("Loowater is doomed!\n");
            }
           
            numHeads = sc.nextInt();
            numKnights = sc.nextInt();
        }
                                              
        bw.flush();
        bw.close();
       
        return;
    }
}
