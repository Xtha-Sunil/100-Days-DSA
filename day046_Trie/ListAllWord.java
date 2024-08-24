class TrieNode {
    TrieNode[] children;
    boolean isEndOfWord;

    public TrieNode() {
        children = new TrieNode[26]; // Assuming lowercase English letters
        isEndOfWord = false;
    }
}

class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEndOfWord = true;
    }

    public void listAllWords() {
        listWordsFromNode(root, "");
    }

    private void listWordsFromNode(TrieNode node, String prefix) {
        if (node == null) {
            return;
        }

        if (node.isEndOfWord) {
            System.out.println(prefix);
        }

        for (char c = 'a'; c <= 'z'; c++) {
            TrieNode child = node.children[c - 'a'];
            if (child != null) {
                listWordsFromNode(child, prefix + c);
            }
        }
    }
}

public class ListAllWord{
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("app");
        trie.insert("banana");
        trie.insert("bat");

        System.out.println("All words in the Trie:");
        trie.listAllWords();
    }
}
