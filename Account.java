

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
	public static void main(String[] args) throws IOException {
		File file = new File("F:\\A.txt");
		RandomAccessFile raf = new RandomAccessFile(file, "rw"); 
		Accounts a=new Accounts("Name",123,2000);
		raf.writeInt(a.getId());
		raf.writeUTF(a.getName());
		raf.writeDouble(a.getBalance());
		System.out.println(a.toString());
		long currentPosition = raf.getFilePointer(); 
		raf.seek(0);
		String name = raf.readUTF();
		System.out.println(name);
		int id = raf.readInt();
		System.out.println(id);
		double balance = raf.readDouble();
		System.out.println(balance);
		raf.close();

	}

}
