package tries_huffman_coding;

public class trie_node {
    
    char data;
    boolean is_terminal;
    trie_node children[];
    int child_count;

    public trie_node(char data) {
        this.data = data;
        this.is_terminal = false;
        this.children = new trie_node[26];
        this.child_count = 0;
    }
}
