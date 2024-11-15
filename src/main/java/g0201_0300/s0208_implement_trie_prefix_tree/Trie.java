package g0201_0300.s0208_implement_trie_prefix_tree;

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #String #Hash_Table #Design #Trie
// #Level_2_Day_16_Design #Udemy_Trie_and_Heap
// #Big_O_Time_O(word.length())_or_O(prefix.length())_Space_O(N)
// #2024_11_15_Time_30_ms_(99.78%)_Space_55.1_MB_(72.51%)

@SuppressWarnings("java:S1104")
public class Trie {
    boolean ans=false;
    TrieNode[] trees=new TrieNode[26];
    public Trie() {

    }

    TrieNode mapWordToTree(TrieNode t, String word, int i){
        char m=word.charAt(i);
        boolean found=false;
        TrieNode a=t.nexts[m-'a'];
        if(a!=null){
            if(i!=word.length()-1){
                mapWordToTree(a,word,i+1);
                found=true;

            }else{
                a.end=true;
                found=true;
            }
        }
        if(!found){
            TrieNode prev=t;
            for(int j=i;j<word.length();j++){
                TrieNode temp=new TrieNode(word.charAt(j));
                prev.nexts[word.charAt(j)-'a']=temp;
                prev=temp;
            }
            prev.end=true;
        }
        return t;
    }

    public void insert(String word) {
        char a=word.charAt(0);
        if(trees[a-'a']==null){
            TrieNode t=new TrieNode(a);
            trees[a-'a']=t;
            if(1==word.length()){
                trees[a-'a'].end=true;
                return;
            }
            trees[a-'a']=mapWordToTree(trees[a-'a'],word,1);
        }else{
            if(1==word.length()){
                trees[a-'a'].end=true;
                return;
            }
            trees[a-'a']=mapWordToTree(trees[a-'a'],word,1);
        }
        //System.out.println(trees[a-'a']);
    }
    public boolean searchWordInTree(TrieNode t, String word, int i){
        char a=word.charAt(i);
        TrieNode m=t.nexts[a-'a'];
        if(m!=null){

            if(i==word.length()-1){
                ans=true;
                if(m.end){
                    return true;
                }else{
                    return false;
                }
            }
            return searchWordInTree(m,word, i+1);

        }
        return false;
    }
    public boolean search(String word) {
        char a=word.charAt(0);
        if(trees[a-'a']==null){
            return false;
        }else{
            if(1==word.length()){
                if(trees[a-'a'].end){
                    return true;
                }else{
                    return false;
                }
            }
            return searchWordInTree(trees[a-'a'],word,1);
        }
    }

    public boolean startsWith(String prefix) {
        char a=prefix.charAt(0);
        ans=false;
        if(trees[a-'a']==null){
            return false;
        }else{
            if(1==prefix.length()){
                return true;
            }
            searchWordInTree(trees[a-'a'],prefix,1);
        }
        return ans;
    }

    class TrieNode{
        char val;
        boolean end=false;
        TrieNode[] nexts=new TrieNode[26];
        TrieNode(char val){
            this.val=val;
        }
        @Override public String toString(){
            return val+" "+nexts+" "+end;
        }
    }
}

/*
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */

/*
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
