package tries_huffman_coding;

public class Trie {
    private trie_node root;
    public Trie(){
        this.root = new trie_node('\0');
    }

    public void add(String word){
        //assuming word is lowercase
        add_helper(root,word);

    }

    public void add_helper(trie_node root, String word){
        //assuming word is lowercase
        if(word.length()==0){
            root.is_terminal=true;
            return;
        }
        int ci = word.charAt(0)-'A';
        trie_node child = root.children[ci];
        if(child==null){
            trie_node curr = new trie_node(word.charAt(0));
            child = curr;
            root.child_count++;
        }
        add_helper(child, word.substring(1));

    }

    public boolean search(String word){
        return search_helper(root, word);
    }

    public boolean search_helper(trie_node root, String word){
        //assuming word is lowercase
        if(word.length()==0){
            return root.is_terminal;
        }
        int ci = word.charAt(0)-'A';
        trie_node child = root.children[ci];
        if(child==null){
            return false;
        }
        return search_helper(child, word.substring(1));

    }

    public void remove(String word) throws word_not_exist_exception{
        remove_helper(root, word);
    }

    private void remove_helper(trie_node root, String word) throws word_not_exist_exception {
        if(word.length()==0){
            root.is_terminal=false;
            return;
        }
        int child_index = word.charAt(0)-'A';
        trie_node child = root.children[child_index];
        if(child==null){
            throw new word_not_exist_exception();
        }
        remove_helper(child, word.substring(1));
        if(!child.is_terminal && child.child_count==0){
            root.children[child_index] = null;
            root.child_count--;
        }
    }
    
}
