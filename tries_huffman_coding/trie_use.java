package tries_huffman_coding;

public class trie_use {
    public static void main(String[] args) throws word_not_exist_exception {
        Trie t = new Trie();
        t.add("SHIVAM");
        t.add("GOAT");
        System.out.println(t.search("GOAT"));
        t.remove("GOAT");
        System.out.println(t.search("GOAT"));

    }
}
