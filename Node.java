import java.math.*;
import java.util.*;
public class Node implements Comparable<Node>{
	public String name;
	public int count;
	public int height;
	public Node parent;
	public Node left;
	public Node right;
	public Node(String name, int count){
		this.name = name;
		this.count = count;
		this.parent = null;
		this.right = null;
		this.left = null;
		this.height = 0;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public void setHeight(int height)
	{
		this.height = height;
	}
	
	public void incHeight()
	{
		height++;
	}
	
	public void decHeight()
	{
		height--;
	}
	
	public void setName(String name) {
		this.name = name;
		return;
	}
	
	public void setCount(int count){
		this.count = count;
		return;
	}
	
	public String getName(){
		return name;
	}
	
	public int getCount(){
		return count;
	}
	
	public Node right(){
		return right;
	}
	
	public void setRight(Node right){
		this.right = right;
		return;
	}
	
	public Node left(){
		return left;
	}
	
	public void setLeft(Node left){
		this.left = left;
		return;
	}
	
	public Node parent(){
		return parent;
	}
	
	public void setParent(Node parent){
		this.parent = parent;
		return;
	}

	@Override
	public int compareTo(Node n) {
		return this.name.compareTo(n.getName());
	}
}
