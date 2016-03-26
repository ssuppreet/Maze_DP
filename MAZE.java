//package com.pesit.dp;

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
				FileReader in = new FileReader("C:/Users/Kulkarni/Desktop/dp/CreateMaze (1).txt");
				BufferedReader br = new BufferedReader(in);
				String line = null;
				while ((line = br.readLine()) != null) 
				{
					//System.out.println(line);
					s=line.split(" ");
					j=0;
					while(j<s.length)
					{
						arr.add(Integer.parseInt(s[j]));
						//System.out.println(a[i][j]);
						j++;
					}
				}
				m=arr.size();
				
				int z=m/5;
				//System.out.println(z);
				a=new int [z][5];
				for(i=0;i<z;i++)
				{
					//System.out.println("..."+i);
					for(j=0;j<5;j++)
					{	
						
						a[i][j]=arr.get(x++);
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
			///System.out.println("Entered for traversing!!");
			try
			{	
				File f=new File("C:/Users/Kulkarni/Desktop/dp/Output.txt");
				FileWriter fout=new FileWriter(f);
				BufferedWriter bb=new BufferedWriter(fout);
				FileReader in = new FileReader("C:/Users/Kulkarni/Desktop/dp/TraverseMaze (1).txt");
				BufferedReader br = new BufferedReader(in);
				String line = null;
				int j;
				int i=1;
				while ((line = br.readLine()) != null) 
				{
					arr=new ArrayList<Integer>();
					//System.out.println(line);
					s=line.split(" ");
					j=0;
					while(j<s.length)
					{
						arr.add(Integer.parseInt(s[j]));
						//System.out.println(a[i][j]);
						j++;	
					}
					m=arr.size();
					x=arr.get(0);
					while(i<m)
					{
						n=arr.get(i);
						if(a[x-1][n+1]!=0)
						{
							x=a[x-1][n+1];
						}
						i++;
					}
					//System.out.println("After traversing row"+i+" you reached room "+x);
					
					bb.write(new Integer(x).toString());
					bb.newLine();
					bb.flush();
				}
				
				in.close();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}


