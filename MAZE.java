package com.pesit.dp;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class MAZE 
{
		ArrayList<Integer> arr;
		String s[]=null;
		int i=0,j=0,m,n;
		int x=0;
		int a[][];
		
		public void makeMaze()
		{
			//System.out.println("Initiating construction!!");
			try
			{
				arr=new ArrayList<Integer>();
				FileReader in = new FileReader("C:/Users/Kulkarni/Desktop/dp/CreateMaze.txt");
				//System.out.println("hi");
				BufferedReader br = new BufferedReader(in);
				String line = null;
				while ((line = br.readLine()) != null) 
				{
					if(!(line.equals("")))
					{
					//System.out.println(line);
					s=line.split(" ");
					j=0;
					//System.out.println(s.length);
					while(j<s.length)
					{
						arr.add(Integer.parseInt(s[j]));
						//System.out.println(a[i][j]);
						j++;
					}
					}
				}
				m=arr.size();
				
				int z=m/5;
				//System.out.println("..."+z);
				a=new int [z][5];
				for(i=0;i<z;i++)
				{
					//System.out.println("..."+i);
					for(j=0;j<5;j++)
					{	
						//System.out.println("he");
						a[i][j]=arr.get(x++);
						///System.out.println(a[i][j]);
					}			
				}	
				in.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}	
		}
		
		
		
		
		public void travMaze()
		{
			System.out.println("Entered for traversing!!");
			try
			{	
				File f=new File("C:/Users/Kulkarni/Desktop/dp/Output.txt");
				FileWriter fout=new FileWriter(f);
				BufferedWriter bb=new BufferedWriter(fout);
				FileReader in = new FileReader("C:/Users/Kulkarni/Desktop/dp/TraverseMaze.txt");
				BufferedReader br = new BufferedReader(in);
				String line = null;
				int j;
			
				while ((line = br.readLine()) != null) 
				{
					int i=1;
					if(!(line.equals("")))
					{	
					arr=new ArrayList<Integer>();
					//System.out.println(line);
					s=line.split(" ");
					j=0;
					while(j<s.length)
					{
						arr.add(Integer.parseInt(s[j]));
						//System.out.println(arr.get(j));
						j++;	
					}
					m=arr.size();
					System.out.println(m);
					x=arr.get(0);
					while(i<m)
					{
						n=arr.get(i++);
						//if(i==3)
						//System.out.println(arr.get(i));
						if(a[x-1][n+1]!=0)
						{
							//System.out.println(a[x-1][n+1]);
							x=a[x-1][n+1];
							System.out.println("You are in room "+x);
							
						}
						//System.out.println("\n");
						
					}
					System.out.println("After traversing row"+i+" you reached room "+x);
					
					bb.write(new Integer(x).toString());
					bb.newLine();
					bb.flush();
					}
				}
				
				in.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}


