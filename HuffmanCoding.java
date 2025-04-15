import java.util.*;
class HuffmanNode {
    char ch;
    int freq;
    HuffmanNode left, right;
    HuffmanNode(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
    }
}

class HuffmanComparator implements Comparator<HuffmanNode> {
    public int compare(HuffmanNode a, HuffmanNode b) {
        return a.freq - b.freq;
    }
}

public class HuffmanCoding {
    public static void printCodes(HuffmanNode root, String code) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            System.out.println(root.ch + ": " + code);
            return;
        }
        printCodes(root.left, code + "0");
        printCodes(root.right, code + "1");
    }

    public static void main(String[] args) {
        char[] chars = { 'a', 'b', 'c', 'd', 'e', 'f' };
        int[] freqs = { 5, 9, 12, 13, 16, 45 };
        PriorityQueue<HuffmanNode> pq = new PriorityQueue<>(new HuffmanComparator());

        for (int i = 0; i < chars.length; i++) {
            pq.add(new HuffmanNode(chars[i], freqs[i]));
        }
        while (pq.size() > 1) {
            HuffmanNode left = pq.poll();
            HuffmanNode right = pq.poll();

            HuffmanNode parent = new HuffmanNode('-', left.freq + right.freq);
            parent.left = left;
            parent.right = right;
            pq.add(parent);
        }
        HuffmanNode root = pq.poll();
        System.out.println("Huffman Codes:");
        printCodes(root, "");
    }
}
