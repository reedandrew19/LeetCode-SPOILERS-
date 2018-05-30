package ClassImplementations;

/**
 * Created by Andrew on 5/24/2018.
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x){
        val = x;
    }


    public String getListString(){
        ListNode node = this;
        StringBuilder stringBuilder = new StringBuilder("(");

        while(node != null){
            stringBuilder.append(node.val);
            if(node.next != null){
                stringBuilder.append(',');
            }
            node = node.next;
        }

        stringBuilder.append(')');

        return stringBuilder.toString();
    }
}
