import java.util.*;
import java.io.File;
import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.io.*;
import java.io.IOException;
public class BabyNames {
	public static void main (String[] args){
		if(args.length != 5){
			System.err.println("5 cmd line args needed (babyNames 1");
			System.exit(1);
			
		}
		
		String File2010 = args[0];
		String File2011 = args[1];
		String File2012 = args[2];
		String File2013 = args[3];
		String File2014 = args[4];
		
		Node node1 = new Node("tester",-1);
		Node node2 = new Node("tester",-1);
		Node node3 = new Node("tester",-1);
		Node node4 = new Node("tester",-1);
		Node node5 = new Node("tester",-1);
		Node node6 = new Node("tester",-1);
		Node node7 = new Node("tester",-1);
		Node node8 = new Node("tester",-1);
		Node node9 = new Node("tester",-1);
		Node node10 = new Node("tester",-1);
		
		
		Tree m10 = new Tree(node1);
		Tree f10 = new Tree(node2);
		Tree m11 = new Tree(node3);
		Tree f11 = new Tree(node4);
		Tree m12 = new Tree(node5);
		Tree f12 = new Tree(node6);
		Tree m13 = new Tree(node7);
		Tree f13 = new Tree(node8);
		Tree m14 = new Tree(node9);
		Tree f14 = new Tree(node10);
		
		try{
			InputStream in = new FileInputStream(File2010);
			Scanner s = new Scanner(new File(File2010));
			Node n;
			Node temp;
			Boolean tester1 = true;
			Boolean tester2 = true;
			while(s.hasNextLine()){
				String tempS = s.nextLine();
				int index = tempS.indexOf(',');
				String name = tempS.substring(0,index);
				String sex = tempS.substring(index+1, index+2);
				String tcount = tempS.substring(index+3,tempS.length());
				int count = Integer.parseInt(tcount);
				n = new Node(name,count);
				if(sex.equals("M")){
					if(tester1)
					{
						m10.getRoot().setName(n.getName());
						m10.getRoot().setCount(n.getCount());
						tester1 = false;
					}
					else
					{
						m10.add(m10.getRoot(),n);
						avl(n,m10,null);
					}
				}
				else
				{
					if(tester2) {
						f10.getRoot().setName(n.getName());
						f10.getRoot().setCount(n.getCount());
						tester2 = false;
					}
					else
					{
						f10.add(f10.getRoot(),n);
						avl(n,f10,null);
					}
				}
			}
	
		}
		catch(IOException e){
			System.err.println("File not Found: "+File2010);
			System.exit(1);
		}
		try{
			InputStream in = new FileInputStream(File2011);
			Scanner s = new Scanner(new File(File2011));
			Node n;
			Node temp;
			Boolean tester1 = true;
			Boolean tester2 = true;
			while(s.hasNextLine()){
				String tempS = s.nextLine();
				int index = tempS.indexOf(',');
				String name = tempS.substring(0,index);
				String sex = tempS.substring(index+1, index+2);
				String tcount = tempS.substring(index+3,tempS.length());
				int count = Integer.parseInt(tcount);
				n = new Node(name,count);
				if(sex.equals("M")){
					if(tester1) {
						m11.getRoot().setName(n.getName());
						m11.getRoot().setCount(n.getCount());
						tester1 = false;
					}
					else
					{
						m11.add(m11.getRoot(),n);
						avl(n,m11,null);
					}
				}
				else
				{
					if(tester2) {
						f11.getRoot().setName(n.getName());
						f11.getRoot().setCount(n.getCount());
						tester2 = false;
					}
					else
					{
						f11.add(f11.getRoot(),n);
						avl(n,f11,null);
					}
				}
			}
	
		}
		catch(IOException e){
			System.err.println("File not Found: "+File2011);
			System.exit(1);
		}
		try{
			InputStream in = new FileInputStream(File2012);
			Scanner s = new Scanner(new File(File2012));
			Node n;
			Node temp;
			Boolean tester1 = true;
			Boolean tester2 = true;
			while(s.hasNextLine()){
				String tempS = s.nextLine();
				int index = tempS.indexOf(',');
				String name = tempS.substring(0,index);
				String sex = tempS.substring(index+1, index+2);
				String tcount = tempS.substring(index+3,tempS.length());
				int count = Integer.parseInt(tcount);
				n = new Node(name,count);
				if(sex.equals("M")){
					temp = m12.getRoot();
					if(tester1) {
						m12.getRoot().setName(n.getName());
						m12.getRoot().setCount(n.getCount());
						tester1 = false;
					}
					else
					{
						m12.add(m12.getRoot(),n);
						avl(n,m12,null);
					}
				}
				else
				{
					if(tester2) {
						f12.getRoot().setName(n.getName());
						f12.getRoot().setCount(n.getCount());
						tester2 = false;
					}
					else
					{
						f12.add(f12.getRoot(),n);
						avl(n,f12,null);
					}
				}
			}
	
		}
		catch(IOException e){
			System.err.println("File not Found: "+File2012);
			System.exit(1);
		}
		try{
			InputStream in = new FileInputStream(File2013);
			Scanner s = new Scanner(new File(File2013));
			Node n;
			Node temp;
			Boolean tester1 = true;
			Boolean tester2 = true;
			while(s.hasNextLine()){
				String tempS = s.nextLine();
				int index = tempS.indexOf(',');
				String name = tempS.substring(0,index);
				String sex = tempS.substring(index+1, index+2);
				String tcount = tempS.substring(index+3,tempS.length());
				int count = Integer.parseInt(tcount);
				n = new Node(name,count);
				if(sex.equals("M")){
					if(tester1) {
						m13.getRoot().setName(n.getName());
						m13.getRoot().setCount(n.getCount());
						tester1 = false;
					}
					else
					{
						m13.add(m13.getRoot(),n);
						avl(n,m13,null);
					}
				}
				else
				{
					if(tester2) {
						
						f13.getRoot().setName(n.getName());
						f13.getRoot().setCount(n.getCount());
						tester2 = false;
					}
					else
					{
						f13.add(f13.getRoot(),n);
						avl(n,f13,null);
					}
				}
			}
	
		}
		catch(IOException e){
			System.err.println("File not Found: "+File2013);
			System.exit(1);
		}
		try{
			InputStream in = new FileInputStream(File2014);
			Scanner s = new Scanner(new File(File2014));
			Node n;
			Node temp;
			Boolean tester1 = true;
			Boolean tester2 = true;
			while(s.hasNextLine()){
				String tempS = s.nextLine();
				int index = tempS.indexOf(',');
				String name = tempS.substring(0,index);
				String sex = tempS.substring(index+1, index+2);
				String tcount = tempS.substring(index+3,tempS.length());
				int count = Integer.parseInt(tcount);
				n = new Node(name,count);
				if(sex.equals("M")){
					if(tester1) {
						
						m14.getRoot().setName(n.getName());
						m14.getRoot().setCount(n.getCount());
						tester1 = false;
					}
					else
					{
						m14.add(m14.getRoot(),n);
						avl(n,m14,null);
					}
				}
				else
				{
					if(tester2) {
						
						f14.getRoot().setName(n.getName());
						f14.getRoot().setCount(n.getCount());
						tester2 = false;
					}
					else
					{
						f14.add(f14.getRoot(),n);
						avl(n,f14,null);
					}
				}
			}
		}
		catch(IOException e){
			System.err.println("File not Found: "+File2014);
			System.exit(1);
		}
		
		Node temp = m10.getRoot();
		
		while(temp!= null)
		{
			temp = temp.right();
		}
		
		menu(m10,f10,m11,f11,m12,f12,m13,f13,m14,f14);
	}
	
	public static void avl(Node node, Tree t, Boolean left)
	{
		if(node.parent() != null)
		{
			//should only enter on second call (parent of parent)
			if(Math.abs(getDiff(node.parent())) > 1 && left != null)
			{
				if(left && (node.parent().left() == node))
				{
					ll(node.parent(), t);
				}
				else if(left && (node.parent().right() == node))
				{
					rl(node.parent(), t);
				}
				else if(!left && (node.parent().right() == node))
				{
					rr(node.parent(), t);
				}
				else if(!left && (node.parent().left() == node))
				{
					lr(node.parent(), t);
				}
			}
			else
			{
				if(node.parent().left() == node)
				{
					avl(node.parent(), t, true);
				}
				else if(node.parent().right() == node)
				{
					avl(node.parent(), t, false);
				}
			}
		}
	}
	
	public static void lr(Node node, Tree t)
	{
		rr(node.left(), t);
		ll(node, t);
	}
	
	public static void rl(Node node, Tree t)
	{
		ll(node.right(), t);
		rr(node, t);
	}
	
	public static void ll(Node node, Tree t)
	{
		if(node.parent() == null)
		{
			t.setRoot(node.left());
			node.left().setParent(null);
		}
		else
		{
			if(node.parent().left() == node)
			{
				node.parent().setLeft(node.left());
				node.left().setParent(node.parent());
			}
			else
			{
				node.parent().setRight(node.left());
				node.left().setParent(node.parent());
			}
		}
		
		node.setParent(node.left());
		node.setLeft(node.parent().right());
		node.parent().setRight(node);
		
		if(node.left() != null)
		{
			node.left().setParent(node);
		}	
	}
	
	public static void rr(Node node, Tree t)
	{
		if(node.parent() == null)
		{
			t.setRoot(node.right());
			node.right().setParent(null);
		}
		else
		{
			if(node.parent().left() == node)
			{
				node.parent().setLeft(node.right());
				node.right().setParent(node.parent());
			}
			else
			{
				node.parent().setRight(node.right());
				node.right().setParent(node.parent());
			}
		}
		
		node.setRight(node.right().left());
		node.setParent(node.right());
		node.parent().setLeft(node);
		node.parent().right().setParent(node.parent());
		
		if(node.right() != null)
		{
			node.right().setParent(node);
		}	
	}
	
	public static void distinctName(Tree f10, Tree m10, Tree f11, Tree m11, Tree f12, Tree m12, Tree f13, Tree m13, Tree f14, Tree m14)
	{
		System.out.println("***** DISTINCT NAMES *****");
		System.out.println();
		System.out.println("SEX\t2010\t2011\t2012\t2013\t2014\tTOTAL");
		System.out.println();
		int totm = m10.getSize() + m11.getSize() + m12.getSize() + m13.getSize() + m14.getSize();
		int totf = f10.getSize() + f11.getSize() + f12.getSize() + f13.getSize() + f14.getSize();
		System.out.println("Male\t"+m10.getSize()+"\t"+m11.getSize()+"\t"+m12.getSize()+"\t"+m13.getSize()+"\t"+m14.getSize()+"\t"+totm);
		System.out.println("Female\t"+f10.getSize()+"\t"+f11.getSize()+"\t"+f12.getSize()+"\t"+f13.getSize()+"\t"+f14.getSize()+"\t"+totf);
	}
	
	//check avl pointers, left and right are never null for some reason
	public static void printNames(Tree t)
	{
		LinkedList<Node> q = new LinkedList<Node>();
		q.add(t.getRoot());
		ArrayList<Node> list = new ArrayList<Node>();
		
		while(q.size() > 0)
		{
			Node temp = q.getFirst();
			q.remove(0);
			
			if(temp.left() != null)
			{
				q.add(temp.left());
			}
			
			if(temp.right() != null)
			{
				q.add(temp.right());
			}
			
			list.add(temp);
		}
		
		Collections.sort(list);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getName()+", "+list.get(i).getCount());
		}
	}
	
	public static void printSearchName(int year, String name, Tree m10, Tree f10, Tree m11, Tree f11, Tree m12, Tree f12, Tree m13, Tree f13, Tree m14, Tree f14)
	{
		int ans1 = 0, ans2 = 0;
		
		switch(year)
		{
			case 10:
		
				ans1 = searchName(m10,name);
				ans2 = searchName(f10,name);
				
				break;
			case 11:
		
				ans1 = searchName(m11,name);
				ans2 = searchName(f11,name);
				
				break;
			case 12:
		
				ans1 = searchName(m12,name);
				ans2 = searchName(f12,name);
				
				break;
			case 13:
		
				ans1 = searchName(m13,name);
				ans2 = searchName(f13,name);
				
				break;
			case 14:
		
				ans1 = searchName(m14,name);
				ans2 = searchName(f14,name);
				
				break;
		}
		
		System.out.println("***** SEARCH NAME *****");
		System.out.println();
		System.out.println("NAME\t\tMALES 20"+year+"\tFEMALES 20"+year);
		
		System.out.println(name+"\t\t"+ans1+"\t\t"+ans2);
		
		return;
	}
	
	//fail case loops infinitely
	public static int searchName(Tree t, String name)
	{
		LinkedList<Node> q = new LinkedList<Node>();
		q.add(t.getRoot());
		
		while(q.size() > 0)
		{
			Node temp = q.getFirst();
			q.remove(0);
			
			if(temp.getName().equals(name))
			{
				return temp.getCount();
			}
			else
			{
				if(temp.left() != null)
				{
					q.add(temp.left());
				}
				
				if(temp.right() != null)
				{
					q.add(temp.right());
				}
			}
		}
		
		return 0;
	}
	
	public static void menu(Tree m10, Tree f10, Tree m11, Tree f11, Tree m12, Tree f12, Tree m13, Tree f13, Tree m14, Tree f14)
	{
		boolean quit = false;
		boolean go = false;
		int choice = 0;
		
		do
		{
			go = false;
			do
			{
				System.out.println("***** MAIN MENU *****");
				System.out.println();
				System.out.println("1) Search for a name");
				System.out.println("2) View most popular names");
				System.out.println("3) View least popular names");
				System.out.println("4) View number of unique names");
				System.out.println("5) Display all names");
				System.out.println("6) Quit");
				System.out.println();
				
				try
				{
					Scanner sc = new Scanner(System.in);
					choice = sc.nextInt();
					
					if(choice > 0 && choice < 7)
					{
						go = true;
					}
					else
					{
						System.out.println("Please enter a number between 1 and 6");
					}
						
				}
				catch(InputMismatchException e)
				{
					System.err.println("Please enter a number between 1 and 6");
				}	
			}while(!go);
			
			switch(choice)
			{
				case 1:
					int year = 0;
					go = false;
					do
					{
						System.out.println("Please enter the year of the file which you would like to search");	
						
						try
						{
							Scanner scc = new Scanner(System.in);
							year = scc.nextInt();
							
							if(year > 2009 && year < 2015)
							{
								go = true;
								year -= 2000;
							}
							else
							{
								System.out.println("Please select a year between 2010 and 2014");
							}
						}
						catch(InputMismatchException e)
						{
							System.err.println("Invalid input");
						}
					}while(!go);
					
					go = false;
					String name = "";
					
					do
					{
						System.out.println("Please enter the name you would like to search for");
						
						try
						{
							Scanner scc = new Scanner(System.in);
							name = scc.nextLine();
							
							if(name.length() < 2 || name.length() > 15)
							{
								System.out.println("Please enter a name greater than 2 characters and less than 15 characters");
								go = false;
							}
							else
							{
								go = true;
							}
						}
						catch(InputMismatchException e)
						{
							System.err.println("Invalid input");
						}
					}while(!go);
					
					printSearchName(year, name, m10, f10, m11, f11, m12, f12, m13, f13, m14, f14);
					
					break;
				case 2:
					FiveMostPopular(m10, f10, m11, f11, m12, f12, m13, f13, m14, f14);
					break;
				case 3:
					FiveLeastPopular(m10, f10, m11, f11, m12, f12, m13, f13, m14, f14);
					break;
				case 4:
					distinctName(f10, m10, f11, m11, f12, m12, f13, m13, f14, m14);
					break;
				case 5:
					int year2 = nameMenu();
					
					switch(year2)
					{
						case 2010:
							printNames(m10);
							printNames(f10);
							break;
						case 2011:
							printNames(m11);
							printNames(f11);
							break;
						case 2012:
							printNames(m12);
							printNames(f12);
							break;
						case 2013:
							printNames(m13);
							printNames(f13);
							break;
						case 2014:
							printNames(m14);
							printNames(f14);
							break;
						default:
							System.err.println("Something went wrong");
							break;
					}
					
					break;
				case 6:
					quit = true;
					break;
				default:
					System.out.println("Something went wrong");
					break;
			}
			
		}while(!quit);
	}
	
	public static int nameMenu()
	{
		boolean go = false;
		int year = 0;
		
		do
		{
			System.out.println("Please enter the year of the file which you would like to view.");
			
			try
			{
				Scanner sc = new Scanner(System.in);
				year = sc.nextInt();
				
				if(year < 2010 || year > 2014)
				{
					go = false;
					System.out.println("Please enter a year between 2010 and 2014");
				}
				else
				{
					go = true;
				}
				
			}
			catch(InputMismatchException e)
			{
				System.err.println("Invalid input");
			}
		}while(!go);
			
		return year;
	}
	
public static void FiveLeastPopular(Tree m10, Tree f10, Tree m11, Tree f11, Tree m12, Tree f12, Tree m13, Tree f13, Tree m14, Tree f14){
		//initializing arrays of top 5 names for m/f
		Node[] botm10 = new Node[5];
		Node[] botf10 = new Node[5];
		Node[] botm11 = new Node[5];
		Node[] botf11 = new Node[5];
		Node[] botm12 = new Node[5];
		Node[] botf12 = new Node[5];
		Node[] botm13 = new Node[5];
		Node[] botf13 = new Node[5];
		Node[] botm14 = new Node[5];
		Node[] botf14 = new Node[5];
		Node[] botTotM = new Node[5];
		Node[] botTotF = new Node[5];
		
		//finding min node for m10
		Node n = m10.getRoot(); 
		while(n.left() != null){
			n = n.left();
		}
		//populating botm10
		for(int i=0;i<=4;i++){
			botm10[i]= n; //adding current node set of least-valued nodes
			i++; //incrementing i so that i = current size of array
			if(n.right() != null && i != 5){ //if node has right and array is not full, add n.right to array
				botm10[i] = n.right();
			}
			else{
				i--; //decrement i to reverse for loop incrementing i
			}
			n=n.parent(); // make n it's parent (next smallest node)
		}
		
		//finding min node for m11
		n = m11.getRoot(); 
		while(n.left() != null){
			n = n.left();
		}
		//populating botm11
		for(int i=0;i<=4;i++){
			botm11[i]= n; //adding current node set of least-valued nodes
			i++; //incrementing i so that i = current size of array
			if(n.right() != null && i != 5){ //if node has right and array is not full, add n.right to array
				botm11[i] = n.right();
			}
			else{
				i--; //decrement i to reverse for loop incrementing i
			}
			n=n.parent(); // make n it's parent (next smallest node)
		}
		
		//finding min node for M12
		n = m12.getRoot(); 
		while(n.left() != null){
			n = n.left();
		}
		//populating botM12
		for(int i=0;i<=4;i++){
			botm12[i]= n; //adding current node set of least-valued nodes
			i++; //incrementing i so that i = current size of array
			//problem here is pointer for parent is null.
			if(n.right() != null && i != 5){ //if node has right and array is not full, add n.right to array
				botm12[i] = n.right();
			}
			else{
				i--; //decrement i to reverse for loop incrementing i
			}
			n=n.parent(); // make n it's parent (next smallest node)
		}
		
		//finding min node for m13
		n = m13.getRoot(); 
		while(n.left() != null){
			n = n.left();
		}
		//populating botm13
		for(int i=0;i<=4;i++){
			botm13[i]= n; //adding current node set of least-valued nodes
			i++; //incrementing i so that i = current size of array
			if(n.right() != null && i != 5){ //if node has right and array is not full, add n.right to array
				botm13[i] = n.right();
			}
			else{
				i--; //decrement i to reverse for loop incrementing i
			}
			n=n.parent(); // make n it's parent (next smallest node)
		}
		
		//finding min node for m14
		n = m14.getRoot(); 
		while(n.left() != null){
			n = n.left();
		}
		//populating botm14
		for(int i=0;i<=4;i++){
			botm14[i]= n; //adding current node set of least-valued nodes
			i++; //incrementing i so that i = current size of array
			if(n.right() != null && i != 5){ //if node has right and array is not full, add n.right to array
				botm14[i] = n.right();
			}
			else{
				i--; //decrement i to reverse for loop incrementing i
			}
			n=n.parent(); // make n it's parent (next smallest node)
		}
		
		//finding min node for f10
		n = f10.getRoot(); 
		while(n.left() != null){
			n = n.left();
		}
		//populating botf10
		for(int i=0;i<=4;i++){
			botf10[i]= n; //adding current node set of least-valued nodes
			i++; //incrementing i so that i = current size of array
			if(n.right() != null && i != 5){ //if node has right and array is not full, add n.right to array
				botf10[i] = n.right();
			}
			else{
				i--; //decrement i to reverse for loop incrementing i
			}
			n=n.parent(); // make n it's parent (next smallest node)
		}
		
		//finding min node for f11
		n = f11.getRoot(); 
		while(n.left() != null){
			n = n.left();
		}
		//populating botf11
		for(int i=0;i<=4;i++){
			botf11[i]= n; //adding current node set of least-valued nodes
			i++; //incrementing i so that i = current size of array
			if(n.right() != null && i != 5){ //if node has right and array is not full, add n.right to array
				botf11[i] = n.right();
			}
			else{
				i--; //decrement i to reverse for loop incrementing i
			}
			n=n.parent(); // make n it's parent (next smallest node)
		}
		
		//finding min node for f12
		n = f12.getRoot(); 
		while(n.left() != null){
			n = n.left();
		}
		//populating botf12
		for(int i=0;i<=4;i++){
			botf12[i]= n; //adding current node set of least-valued nodes
			i++; //incrementing i so that i = current size of array
			if(n.right() != null && i != 5){ //if node has right and array is not full, add n.right to array
				botf12[i] = n.right();
			}
			else{
				i--; //decrement i to reverse for loop incrementing i
			}
			n=n.parent(); // make n it's parent (next smallest node)
		}
		
		//finding min node for f13
		n = f13.getRoot(); 
		while(n.left() != null){
			n = n.left();
		}
		//populating botf13
		for(int i=0;i<=4;i++){
			botf13[i]= n; //adding current node set of least-valued nodes
			i++; //incrementing i so that i = current size of array
			if(n.right() != null && i != 5){ //if node has right and array is not full, add n.right to array
				botf13[i] = n.right();
			}
			else{
				i--; //decrement i to reverse for loop incrementing i
			}
			n=n.parent(); // make n it's parent (next smallest node)
		}
		
		//finding min node for f14
		n = f14.getRoot(); 
		while(n.left() != null){
			n = n.left();
		}
		//populating botf14
		for(int i=0;i<=4;i++){
			botf14[i]= n; //adding current node set of least-valued nodes
			i++; //incrementing i so that i = current size of array
			if(n.right() != null && i != 5){ //if node has right and array is not full, add n.right to array
				botf14[i] = n.right();
			}
			else{
				i--; //decrement i to reverse for loop incrementing i
			}
			n=n.parent(); // make n it's parent (next smallest node)
		}
		
		// making hashmap of least popular male names
		HashMap male = new HashMap();
		for(int i=0;i<=4;i++){ //adding first array of 5 least popular to hashmap
			male.put(botm10[i].getName(), botm10[i].getCount());
		}
		for(int i=0;i<=4;i++){
			if(!male.containsKey(botm11[i].getName())){//if hashmap doesn't contain key, add key and value
				male.put(botm11[i].getName(),botm11[i].getCount());
			}
			else{//else add count to duplicate
				int temp = (int)male.get(botm11[i].getName());
				male.put(botm11[i].getName(),temp+botm11[i].getCount());
			}
		}
		for(int i=0;i<=4;i++){
			if(!male.containsKey(botm12[i].getName())){//if hashmap doesn't contain key, add key and value
				male.put(botm12[i].getName(),botm12[i].getCount());
			}
			else{//else add count to duplicate
				int temp = (int)male.get(botm12[i].getName());
				male.put(botm12[i].getName(),temp+botm12[i].getCount());
			}
		}
		for(int i=0;i<=4;i++){
			if(!male.containsKey(botm13[i].getName())){//if hashmap doesn't contain key, add key and value
				male.put(botm13[i].getName(),botm13[i].getCount());
			}
			else{//else add count to duplicate
				int temp = (int)male.get(botm13[i].getName());
				male.put(botm13[i].getName(),temp+botm13[i].getCount());
			}
		}
		for(int i=0;i<=4;i++){
			if(!male.containsKey(botm14[i].getName())){//if hashmap doesn't contain key, add key and value
				male.put(botm14[i].getName(),botm14[i].getCount());
			}
			else{//else add count to duplicate
				int temp = (int)male.get(botm14[i].getName());
				male.put(botm14[i].getName(),temp+botm14[i].getCount());
			}
		}
		
		for(int i=0;i<=4;i++){
			int test=99999999;
		    Iterator it = male.entrySet().iterator();//iterating through hashmap
		    Map.Entry pair = null;
		    Node min = null;
		    while (it.hasNext()) {//while hashmap has next
		        pair = (Map.Entry)it.next();
		        if((int)pair.getValue()<test){//find min value in hashmap
		        	test = (int)pair.getValue();
		        	min = new Node(pair.getKey().toString(),(int)pair.getValue());
		        }
		    }
		    botTotM[i] = min;//add min to least popular total names
		    male.remove((Object)min.getName());//remove min from hashmap
		    
		    
		    
		}
		//// making hashmap of most popular female names
		HashMap female = new HashMap();
		for(int i=0;i<=4;i++){//adding first array of 5 most popular to hashmap
			female.put(botf10[i].getName(), botf10[i].getCount());
		}
		for(int i=0;i<=4;i++){
			if(!female.containsKey(botf11[i].getName())){//if hashmap doesn't contain key, add key and value
				female.put(botf11[i].getName(),botf11[i].getCount());
			}
			else{//else add count to duplicate
				int temp = (int)female.get(botf11[i].getName());
				female.put(botf11[i].getName(),temp+botf11[i].getCount());
			}
		}
		for(int i=0;i<=4;i++){
			if(!female.containsKey(botf12[i].getName())){//if hashmap doesn't contain key, add key and value
				female.put(botf12[i].getName(),botf12[i].getCount());
			}
			else{//else add count to duplicate
				int temp = (int)female.get(botf12[i].getName());
				female.put(botf12[i].getName(),temp+botf12[i].getCount());
			}
		}
		for(int i=0;i<=4;i++){
			if(!female.containsKey(botf13[i].getName())){//if hashmap doesn't contain key, add key and value
				female.put(botf13[i].getName(),botf13[i].getCount());
			}
			else{//else add count to duplicate
				int temp = (int)female.get(botf13[i].getName());
				female.put(botf13[i].getName(),temp+botf13[i].getCount());
			}
		}
		for(int i=0;i<=4;i++){
			if(!female.containsKey(botf14[i].getName())){//if hashmap doesn't contain key, add key and value
				female.put(botf14[i].getName(),botf14[i].getCount());
			}
			else{//else add count to duplicate
				int temp = (int)female.get(botf14[i].getName());
				female.put(botf14[i].getName(),temp+botf14[i].getCount());
			}
		}
		
		for(int i=0;i<=4;i++){
			int test=99999999;
		    Iterator it = female.entrySet().iterator();//iterating through hashmap
		    Map.Entry pair = null;
		    Node min = null;
		    while (it.hasNext()) {
		        pair = (Map.Entry)it.next();
		        if((int)pair.getValue()<test){//finding min value
					test = (int)pair.getValue();
		        	min = new Node(pair.getKey().toString(),(int)pair.getValue());
		        }
		    }
		    botTotF[i] = min;//add min to array of least popular names
		    female.remove((Object)min.getName());//remove min from hashmap
		    
		    
		    
		}
		
		//displaying data for men
		System.out.println("Least Popular Male Names");
		System.out.println("Year\tF-1\t\tF-2\t\tF-3\t\tF-4\t\tF-5");
		System.out.println("2010\t"+botm10[0].getName()+","+botm10[0].getCount()+"\t\t"+botm10[1].getName()+","+botm10[1].getCount()+"\t\t"+botm10[2].getName()+","+botm10[2].getCount()+"\t"
				+botm10[3].getName()+","+botm10[3].getCount()+"\t"+botm10[4].getName()+","+botm10[4].getCount());
		System.out.println("2011\t"+botm11[0].getName()+","+botm11[0].getCount()+"\t"+botm11[1].getName()+","+botm11[1].getCount()+"\t"+botm11[2].getName()+","+botm11[2].getCount()+"\t\t"
				+botm11[3].getName()+","+botm11[3].getCount()+"\t\t"+botm11[4].getName()+","+botm11[4].getCount());
		System.out.println("2012\t"+botm12[0].getName()+","+botm12[0].getCount()+"\t"+botm12[1].getName()+","+botm12[1].getCount()+"\t\t"+botm12[2].getName()+","+botm12[2].getCount()+"\t\t"
				+botm12[3].getName()+","+botm12[3].getCount()+"\t"+botm12[4].getName()+","+botm12[4].getCount());
		System.out.println("2013\t"+botm13[0].getName()+","+botm13[0].getCount()+"\t\t"+botm13[1].getName()+","+botm13[1].getCount()+"\t"+botm13[2].getName()+","+botm13[2].getCount()+"\t"
				+botm13[3].getName()+","+botm13[3].getCount()+"\t\t"+botm13[4].getName()+","+botm13[4].getCount());
		System.out.println("2014\t"+botm14[0].getName()+","+botm14[0].getCount()+"\t\t"+botm14[1].getName()+","+botm14[1].getCount()+"\t\t"+botm14[2].getName()+","+botm14[2].getCount()+"\t"
				+botm14[3].getName()+","+botm14[3].getCount()+"\t"+botm14[4].getName()+","+botm14[4].getCount());
		System.out.println("Total\t"+botTotM[0].getName()+","+botTotM[0].getCount()+"\t"+botTotM[1].getName()+","+botTotM[1].getCount()+"\t"+botTotM[2].getName()+","+botTotM[2].getCount()+"\t"
				+botTotM[3].getName()+","+botTotM[3].getCount()+"\t"+botTotM[4].getName()+","+botTotM[4].getCount());
		
		//whitespace
		System.out.println();
		System.out.println();
		
		//displaying data for women
		System.out.println("Least Popular Female Names");
		System.out.println("Year\tF-1\t\tF-2\t\tF-3\t\tF-4\t\tF-5");
		System.out.println("2010\t"+botf10[0].getName()+","+botf10[0].getCount()+"\t"+botf10[1].getName()+","+botf10[1].getCount()+"\t"+botf10[2].getName()+","+botf10[2].getCount()+"\t"
				+botf10[3].getName()+","+botf10[3].getCount()+"\t"+botf10[4].getName()+","+botf10[4].getCount());
		System.out.println("2011\t"+botf11[0].getName()+","+botf11[0].getCount()+"\t"+botf11[1].getName()+","+botf11[1].getCount()+"\t"+botf11[2].getName()+","+botf11[2].getCount()+"\t\t"
				+botf11[3].getName()+","+botf11[3].getCount()+"\t"+botf11[4].getName()+","+botf11[4].getCount());
		System.out.println("2012\t"+botf12[0].getName()+","+botf12[0].getCount()+"\t"+botf12[1].getName()+","+botf12[1].getCount()+"\t"+botf12[2].getName()+","+botf12[2].getCount()+"\t"
				+botf12[3].getName()+","+botf12[3].getCount()+"\t"+botf12[4].getName()+","+botf12[4].getCount());
		System.out.println("2013\t"+botf13[0].getName()+","+botf13[0].getCount()+"\t\t"+botf13[1].getName()+","+botf13[1].getCount()+"\t"+botf13[2].getName()+","+botf13[2].getCount()+"\t"
				+botf13[3].getName()+","+botf13[3].getCount()+"\t"+botf13[4].getName()+","+botf13[4].getCount());
		System.out.println("2014\t"+botf14[0].getName()+","+botf14[0].getCount()+"\t"+botf14[1].getName()+","+botf14[1].getCount()+"\t"+botf14[2].getName()+","+botf14[2].getCount()+"\t"
				+botf14[3].getName()+","+botf14[3].getCount()+"\t"+botf14[4].getName()+","+botf14[4].getCount());
		System.out.println("Total\t"+botTotF[0].getName()+","+botTotF[0].getCount()+"\t"+botTotF[1].getName()+","+botTotF[1].getCount()+"\t"+botTotF[2].getName()+","+botTotF[2].getCount()+"\t"
				+botTotF[3].getName()+","+botTotF[3].getCount()+"\t\t"+botTotF[4].getName()+","+botTotF[4].getCount());
	}
	
		public static void FiveMostPopular(Tree m10, Tree f10, Tree m11, Tree f11, Tree m12, Tree f12, Tree m13, Tree f13, Tree m14, Tree f14){
		//initializing arrays of top 5 names for m/f
		Node[] topm10 = new Node[5];
		Node[] topf10 = new Node[5];
		Node[] topm11 = new Node[5];
		Node[] topf11 = new Node[5];
		Node[] topm12 = new Node[5];
		Node[] topf12 = new Node[5];
		Node[] topm13 = new Node[5];
		Node[] topf13 = new Node[5];
		Node[] topm14 = new Node[5];
		Node[] topf14 = new Node[5];
		Node[] topTotM = new Node[5];
		Node[] topTotF = new Node[5];
		
		//finding max node for m10
		Node n = m10.getRoot(); 
		while(n.right() != null){
			n = n.right();
		}
		//populating topm10
		for(int i=0;i<=4;i++){
			topm10[i]= n; //adding current max node to array of top names
			i++; //iterating i to update to current size of array
			if(n.left() != null && i != 5){ //if n has left (next highest value)
				topm10[i] = n.left(); // add left to array of top names
			}
			else{
				i--; //else decrement i
			}
			n=n.parent(); // make n its parent
		}
		
		//finding max node for m11
		n = m11.getRoot(); 
		while(n.right() != null){
			n = n.right();
		}
		//populating topm11
		for(int i=0;i<=4;i++){
			topm11[i]= n; //adding current max node to array of top names
			i++; //iterating i to update to current size of array
			if(n.left() != null && i != 5){ //if n has left (next highest value)
				topm11[i] = n.left(); // add left to array of top names
			}
			else{
				i--; //else decrement i
			}
			n=n.parent(); // make n its parent
		}
		
		//finding max node for M12
		n = m12.getRoot(); 
		while(n.right() != null){
			n = n.right();
		}
		//populating topM12
		for(int i=0;i<=4;i++){
			topm12[i]= n; //adding current max node to array of top names
			i++; //iterating i to update to current size of array
			if(n.left() != null && i != 5){ //if n has left (next highest value)
				topm12[i] = n.left(); // add left to array of top names
			}
			else{
				i--; //else decrement i
			}
			n=n.parent(); // make n its parent
		}
		
		//finding max node for m13
		n = m13.getRoot(); 
		while(n.right() != null){
			n = n.right();
		}
		//populating topm13
		for(int i=0;i<=4;i++){
			topm13[i]= n; //adding current max node to array of top names
			i++; //iterating i to update to current size of array
			if(n.left() != null && i != 5){ //if n has left (next highest value)
				topm13[i] = n.left(); // add left to array of top names
			}
			else{
				i--; //else decrement i
			}
			n=n.parent(); // make n its parent
		}
		
		//finding max node for m14
		n = m14.getRoot(); 
		while(n.right() != null){
			n = n.right();
		}
		//populating topm14
		for(int i=0;i<=4;i++){
			topm14[i]= n; //adding current max node to array of top names
			i++; //iterating i to update to current size of array
			if(n.left() != null && i != 5){ //if n has left (next highest value)
				topm14[i] = n.left(); // add left to array of top names
			}
			else{
				i--; //else decrement i
			}
			n=n.parent(); // make n its parent
		}
		
		//finding max node for f10
		n = f10.getRoot(); 
		while(n.right() != null){
			n = n.right();
		}
		//populating topf10
		for(int i=0;i<=4;i++){
			topf10[i]= n; //adding current max node to array of top names
			i++; //iterating i to update to current size of array
			if(n.left() != null && i != 5){ //if n has left (next highest value)
				topf10[i] = n.left(); // add left to array of top names
			}
			else{
				i--; //else decrement i
			}
			n=n.parent(); // make n its parent
		}
		
		//finding max node for f11
		n = f11.getRoot(); 
		while(n.right() != null){
			n = n.right();
		}
		//populating topf11
		for(int i=0;i<=4;i++){
			topf11[i]= n; //adding current max node to array of top names
			i++; //iterating i to update to current size of array
			if(n.left() != null && i != 5){ //if n has left (next highest value)
				topf11[i] = n.left(); // add left to array of top names
			}
			else{
				i--; //else decrement i
			}
			n=n.parent(); // make n its parent
		}
		
		//finding max node for f12
		n = f12.getRoot(); 
		while(n.right() != null){
			n = n.right();
		}
		//populating topf12
		for(int i=0;i<=4;i++){
			topf12[i]= n; //adding current max node to array of top names
			i++; //iterating i to update to current size of array
			if(n.left() != null && i != 5){ //if n has left (next highest value)
				topf12[i] = n.left(); // add left to array of top names
			}
			else{
				i--; //else decrement i
			}
			n=n.parent(); // make n its parent
		}
		
		//finding max node for f13
		n = f13.getRoot(); 
		while(n.right() != null){
			n = n.right();
		}
		//populating topf13
		for(int i=0;i<=4;i++){
			topf13[i]= n; //adding current max node to array of top names
			i++; //iterating i to update to current size of array
			if(n.left() != null && i != 5){ //if n has left (next highest value)
				topf13[i] = n.left(); // add left to array of top names
			}
			else{
				i--; //else decrement i
			}
			n=n.parent(); // make n its parent
		}
		
		//finding max node for f14
		n = f14.getRoot(); 
		while(n.right() != null){
			n = n.right();
		}
		//populating topf14
		for(int i=0;i<=4;i++){
			topf14[i]= n; //adding current max node to array of top names
			i++; //iterating i to update to current size of array
			if(n.left() != null && i != 5){ //if n has left (next highest value)
				topf14[i] = n.left(); // add left to array of top names
			}
			else{
				i--; //else decrement i
			}
			n=n.parent(); // make n its parent
		}
		
		//hashmap of all top male names over 5 years
		HashMap male = new HashMap();
		for(int i=0;i<=4;i++){
			male.put(topm10[i].getName(), topm10[i].getCount());//adding first array to hashmap
		}
		for(int i=0;i<=4;i++){//adding second array
			if(!male.containsKey(topm11[i].getName())){//if hashmap does not contain name
				male.put(topm11[i].getName(),topm11[i].getCount());//add name and count as new element
			}
			else{//else if it does contain 
				int temp = (int)male.get(topm11[i].getName());
				male.put(topm11[i].getName(),temp+topm11[i].getCount());//add count of duplicate to original
			}
		}
		for(int i=0;i<=4;i++){//adding 3rd array
			if(!male.containsKey(topm12[i].getName())){//if hashmap does not contain name
				male.put(topm12[i].getName(),topm12[i].getCount());//add name and count as new element
			}
			else{//else if it does contain 
				int temp = (int)male.get(topm12[i].getName());
				male.put(topm12[i].getName(),temp+topm12[i].getCount());//add count of duplicate to original
			}
		}
		for(int i=0;i<=4;i++){//adding 4th array
			if(!male.containsKey(topm13[i].getName())){//if hashmap does not contain name
				male.put(topm13[i].getName(),topm13[i].getCount());//add name and count as new element
			}
			else{//else if it does contain 
				int temp = (int)male.get(topm13[i].getName());
				male.put(topm13[i].getName(),temp+topm13[i].getCount());//add count of duplicate to original
			}
		}
		for(int i=0;i<=4;i++){//adding 5th array
			if(!male.containsKey(topm14[i].getName())){//if hashmap does not contain name
				male.put(topm14[i].getName(),topm14[i].getCount());//add name and count as new element
			}
			else{//else if it does contain 
				int temp = (int)male.get(topm14[i].getName());
				male.put(topm14[i].getName(),temp+topm14[i].getCount());//add count of duplicate to original
			}
		}
		
		for(int i=0;i<=4;i++){
			int test=-1;
		    Iterator it = male.entrySet().iterator();//iterating through hashmap
		    Map.Entry pair = null;
		    Node max = null;
		    while (it.hasNext()) {
		        pair = (Map.Entry)it.next();
		        if((int)pair.getValue()>test){//finding max value
		        	test = (int)pair.getValue();
		        	max = new Node(pair.getKey().toString(),(int)pair.getValue());
		        }
		    }
		    topTotM[i] = max;//add max to array
		    male.remove((Object)max.getName());//delete max from hashmap
		    
		    
		    
		}
		//hashmap of all top female names over 5 years
		HashMap female = new HashMap();
		for(int i=0;i<=4;i++){
			female.put(topf10[i].getName(), topf10[i].getCount());//adding first array to hashmap
		}
		for(int i=0;i<=4;i++){
			if(!female.containsKey(topf11[i].getName())){//if hashmap does not contain name
				female.put(topf11[i].getName(),topf11[i].getCount());//add name and count as new element
			}
			else{//else if it does contain 
				int temp = (int)female.get(topf11[i].getName());
				female.put(topf11[i].getName(),temp+topf11[i].getCount());//add count of duplicate to original
			}
		}
		for(int i=0;i<=4;i++){
			if(!female.containsKey(topf12[i].getName())){//if hashmap does not contain name
				female.put(topf12[i].getName(),topf12[i].getCount());//add name and count as new element
			}
			else{//else if it does contain 
				int temp = (int)female.get(topf12[i].getName());
				female.put(topf12[i].getName(),temp+topf12[i].getCount());//add count of duplicate to original
			}
		}
		for(int i=0;i<=4;i++){
			if(!female.containsKey(topf13[i].getName())){//if hashmap does not contain name
				female.put(topf13[i].getName(),topf13[i].getCount());//add name and count as new element
			}
			else{//else if it does contain 
				int temp = (int)female.get(topf13[i].getName());
				female.put(topf13[i].getName(),temp+topf13[i].getCount());//add count of duplicate to original
			}
		}
		for(int i=0;i<=4;i++){
			if(!female.containsKey(topf14[i].getName())){//if hashmap does not contain name
				female.put(topf14[i].getName(),topf14[i].getCount());//add name and count as new element
			}
			else{//else if it does contain 
				int temp = (int)female.get(topf14[i].getName());
				female.put(topf14[i].getName(),temp+topf14[i].getCount());//add count of duplicate to original
			}
		}
		
		for(int i=0;i<=4;i++){
			int test=-1;
		    Iterator it = female.entrySet().iterator();//iterating through hashmap
		    Map.Entry pair = null;
		    Node max = null;
		    while (it.hasNext()) {
		        pair = (Map.Entry)it.next();
		        if((int)pair.getValue()>test){//finding max value
					test = (int)pair.getValue();
		        	max = new Node(pair.getKey().toString(),(int)pair.getValue());
		        }
		    }
		    topTotF[i] = max;//adding max to array
		    female.remove((Object)max.getName());//deleting max from hashmap
		    
		    
		    
		}
		
		
		
		//displaying data for men
		System.out.println("Most Popular Male Names");
		System.out.println("Year\tF-1\t\tF-2\t\tF-3\t\tF-4\t\tF-5");
		System.out.println("2010\t"+topm10[0].getName()+","+topm10[0].getCount()+"\t"+topm10[1].getName()+","+topm10[1].getCount()+"\t"+topm10[2].getName()+","+topm10[2].getCount()+"\t"
				+topm10[3].getName()+","+topm10[3].getCount()+"\t"+topm10[4].getName()+","+topm10[4].getCount());
		System.out.println("2011\t"+topm11[0].getName()+","+topm11[0].getCount()+"\t"+topm11[1].getName()+","+topm11[1].getCount()+"\t"+topm11[2].getName()+","+topm11[2].getCount()+"\t"
				+topm11[3].getName()+","+topm11[3].getCount()+"\t"+topm11[4].getName()+","+topm11[4].getCount());
		System.out.println("2012\t"+topm12[0].getName()+","+topm12[0].getCount()+"\t"+topm12[1].getName()+","+topm12[1].getCount()+"\t"+topm12[2].getName()+","+topm12[2].getCount()+"\t"
				+topm12[3].getName()+","+topm12[3].getCount()+"\t"+topm12[4].getName()+","+topm12[4].getCount());
		System.out.println("2013\t"+topm13[0].getName()+","+topm13[0].getCount()+"\t"+topm13[1].getName()+","+topm13[1].getCount()+"\t"+topm13[2].getName()+","+topm13[2].getCount()+"\t"
				+topm13[3].getName()+","+topm13[3].getCount()+"\t"+topm13[4].getName()+","+topm13[4].getCount());
		System.out.println("2014\t"+topm14[0].getName()+","+topm14[0].getCount()+"\t"+topm14[1].getName()+","+topm14[1].getCount()+"\t"+topm14[2].getName()+","+topm14[2].getCount()+"\t"
				+topm14[3].getName()+","+topm14[3].getCount()+"\t"+topm14[4].getName()+","+topm14[4].getCount());
		System.out.println("Total\t"+topTotM[0].getName()+","+topTotM[0].getCount()+"\t"+topTotM[1].getName()+","+topTotM[1].getCount()+"\t"+topTotM[2].getName()+","+topTotM[2].getCount()+"\t"
				+topTotM[3].getName()+","+topTotM[3].getCount()+"\t"+topTotM[4].getName()+","+topTotM[4].getCount());
		
		//whitespace
		System.out.println();
		System.out.println();
		
		//displaying data for women
		System.out.println("Most Popular Female Names");
		System.out.println("Year\tF-1\t\tF-2\t\tF-3\t\tF-4\t\tF-5");
		System.out.println("2010\t"+topf10[0].getName()+","+topf10[0].getCount()+"\t"+topf10[1].getName()+","+topf10[1].getCount()+"\t"+topf10[2].getName()+","+topf10[2].getCount()+"\t"
				+topf10[3].getName()+","+topf10[3].getCount()+"\t"+topf10[4].getName()+","+topf10[4].getCount());
		System.out.println("2011\t"+topf11[0].getName()+","+topf11[0].getCount()+"\t"+topf11[1].getName()+","+topf11[1].getCount()+"\t"+topf11[2].getName()+","+topf11[2].getCount()+"\t"
				+topf11[3].getName()+","+topf11[3].getCount()+"\t"+topf11[4].getName()+","+topf11[4].getCount());
		System.out.println("2012\t"+topf12[0].getName()+","+topf12[0].getCount()+"\t"+topf12[1].getName()+","+topf12[1].getCount()+"\t"+topf12[2].getName()+","+topf12[2].getCount()+"\t"
				+topf12[3].getName()+","+topf12[3].getCount()+"\t"+topf12[4].getName()+","+topf12[4].getCount());
		System.out.println("2013\t"+topf13[0].getName()+","+topf13[0].getCount()+"\t"+topf13[1].getName()+","+topf13[1].getCount()+"\t"+topf13[2].getName()+","+topf13[2].getCount()+"\t"
				+topf13[3].getName()+","+topf13[3].getCount()+"\t"+topf13[4].getName()+","+topf13[4].getCount());
		System.out.println("2014\t"+topf14[0].getName()+","+topf14[0].getCount()+"\t"+topf14[1].getName()+","+topf14[1].getCount()+"\t"+topf14[2].getName()+","+topf14[2].getCount()+"\t"
				+topf14[3].getName()+","+topf14[3].getCount()+"\t"+topf14[4].getName()+","+topf14[4].getCount());
		System.out.println("Total\t"+topTotF[0].getName()+","+topTotF[0].getCount()+"\t"+topTotF[1].getName()+","+topTotF[1].getCount()+"\t"+topTotF[2].getName()+","+topTotF[2].getCount()+"\t"
				+topTotF[3].getName()+","+topTotF[3].getCount()+"\t"+topTotF[4].getName()+","+topTotF[4].getCount());
		
		System.out.println();
		System.out.println();
	}
		
	public static int getDiff(Node n)
	{
		if(n.right() == null && n.left() == null)
		{
			return 0;
		}
		
		if(n.right() == null)
		{
			return -Math.abs(getHeight(n.left())) - 1;
		}
		
		if(n.left() == null)
		{
			return Math.abs(getHeight(n.right())) + 1;
		}
		
		int val = (Math.abs(getHeight(n.right()))+1) - (Math.abs(getHeight(n.left()))+1);
		
		return val;
	}
	
	public static int getHeight(Node n)
	{
		int val = 0;
		
		if(n.left() == null && n.right() == null)
		{
			n.setHeight(val);
			return val;
		}
		
		if(n.left() == null)
		{
			val = (getHeight(n.right()) + 1);
			n.setHeight(val);
			return val;
		}
		
		if(n.right() == null)
		{
			val = -(getHeight(n.left()) + 1);
			n.setHeight(val);
			return val;
		}
		
		val = Math.max(Math.abs(getHeight(n.right())) + 1, Math.abs(getHeight(n.left()))+1);
		n.setHeight(val);
		return val;
	}
	public static void PrintToFile(String[] output, int year) throws FileNotFoundException{ //method to store total account balance
		String filename = "src/outputfile" + year +".txt";//output file name for given year
		try {
		      PrintStream out = new PrintStream(new FileOutputStream("src/outputfile" + year +".txt"));//new printstream for output
		      for (int i = 0; i<output.length; i++){//for each line in output
		    	  out.println(output[i]);//print specified line
		      }
		      out.close();//close printstream to free up memory

		} 
		catch (FileNotFoundException e) {//exception if there is no such file
		      e.printStackTrace();
		}
	}
}
