package com.Filehandling;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;

class Accounts implements Serializable
{
    String name;
    int id;
    transient int balance;
    //private static final long serialVersionUID =1;
   public Accounts(String name, int id, int balance)
    {
    this.name = name;
    this.id = id;
    this.balance = balance;
    }

   public String getName() 
   {
	   return name;
   }
   public void setName(String name) 
   	{
	   this.name = name;
	}
   public int getId() 
   {
	   return id;
   }
   public void setId(int id) 
   {
	   this.id =id;
   }
   public double getBalance()
   {
	 return balance;
   }
   public int setBalance(double balance)
   {
	   return this.balance=(int) balance;
   }
   public String toString()
   {
	return name+" "+id+" "+balance+" "; 
   }
   
	 
}

public class Account {
	public static Accounts printBalance(double bal) throws Exception {
		if(bal>10000) {
		  System.out.println("Balance= "+bal);
		}
		return null;
		}
		public static Accounts createAccount() throws Exception{
			File file = new File("F:\\A.txt");
			RandomAccessFile raf = new RandomAccessFile(file, "rw");
			Accounts a=new Accounts("name",123,30000);
			raf.writeInt(a.getId());
			raf.writeUTF(a.getName());
			raf.writeDouble(a.getBalance());
			System.out.println("AccountOperation:  name=" + a.getName() + ", account no=" +a.getId()+", balance="+a.getBalance());
			System.out.println("Account created.....");
			raf.close();
			return null;
			}
			public static  Accounts readAccount() throws Exception{
			File file = new File("F:\\A.txt");
			RandomAccessFile raf = new RandomAccessFile(file, "rw");
			long currentPosition = raf.getFilePointer();
			raf.seek(0);
			System.out.println();
			System.out.println("Reading created Account.....");
			int id = raf.readInt();
			System.out.println("AccountId= "+id);
			String name = raf.readUTF();
			System.out.println("Name= "+name);
			double balance = raf.readDouble();
			System.out.println("Balance = "+balance);
			System.out.println();
			raf.close();
			return null;
			}
			public static  Accounts updateAccount() throws Exception{
			File file = new File("F:\\A.txt");
			RandomAccessFile raf = new RandomAccessFile(file, "rw");
			Accounts a=new Accounts(null, 0, 0);
			long currentPosition = raf.getFilePointer();
			raf.seek(currentPosition++);
			a.setId(1234);
			raf.writeInt(a.getId());
			a.setName("new");
			raf.writeUTF(a.getName());
			a.setBalance(122200.0);
			raf.writeDouble(a.getBalance());
			System.out.println(a.toString());
			raf.close();
			System.out.println();
			System.out.println(" Account Upadted...!!");
			return null;
			}
			public static  Accounts deleteAccount() throws Exception{
			File file = new File("F:\\A.txt");
			RandomAccessFile raf = new RandomAccessFile(file, "rw");
			Accounts a=new Accounts(null, 0, 0);
			long currentPosition = raf.getFilePointer();
			raf.seek(0);
			a.setId(0);
			raf.writeInt(a.getId());
			a.setName("ritika");
			raf.writeUTF(a.getName());
			a.setBalance(0.0);
			raf.writeDouble(a.getBalance());
			System.out.println(a.toString());
			raf.close();
			System.out.println();
			System.out.println("Account deleted....");
			raf.close();
			return null;

			}


			public static void main(String[] args) throws Exception{
			createAccount();
			readAccount();
			updateAccount();
			readAccount();
			deleteAccount();
			readAccount();
			System.out.println("completed");



			

	}

}
