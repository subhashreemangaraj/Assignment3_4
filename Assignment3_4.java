import java.util.Scanner;

public class Assignment3_4 {//students' system
	
	String name;
	String roll_num;
	float maths;
	float science;
	float english;
	float history;
	float comp;
	float sports;
	
	public String getname(){
		return name;
	}
	
	public String getroll_num(){
		return roll_num;
	}
	
	public float getmaths(){
		return maths;
	}
	
	public float getscience(){
		return science;
	}
	
	public float getenglish(){
		return english;
	}
	
	public float gethistory(){
		return history;
	}
	
	public float getcomp(){
		return comp;
	}
	
	public float getsports(){
		return sports;
	}
	
	public void setname(String sname){
		name = sname;
	}
	
	public void setroll_num(String sroll_num){
		roll_num = sroll_num;
	}
	
	public void setmaths(float smaths){
		maths = (float)smaths;
	}
	
	public void setscience(float sscience){
		science = sscience;
	}
	
	public void setenglisg(float senglish){
	english = senglish;
	}
	
	public void sethistory(float shistory){
		history = shistory;
		}
	
	public void setcomp(float scomp){
		comp = scomp;
		}
	
	public void setsports(float ssports){
		sports = ssports;
		}
	
	public float compute( ){
		
		float result, tot;
		tot = this.getmaths() + this.getenglish() + 
				 this.getscience() + this.gethistory() +
				 this.getcomp() + this.getsports();
		
		result = tot / 6;
		
		return result;
	}
	
	public static void main(String[] args) {
		
		String nam, roll;
		int optn;
		float m,e,sc,his,com,sp, res;
		
		do {
			
			Scanner s = new Scanner(System.in);
			
			Assignment3_4 obj = new Assignment3_4();
			
			System.out.println("Enter the name");
			nam = s.nextLine();
			obj.setname(nam);
			
			System.out.println("Enter the roll num");
			roll = s.nextLine();
			obj.setroll_num(roll);
			
			System.out.println("Enter the maths marks");
			m = s.nextFloat(); 
			obj.setmaths(m);
			
			System.out.println("Enter the science marks");
			sc = s.nextFloat(); 
			obj.setscience(sc);
			
			System.out.println("Enter the english marks");
			e = s.nextFloat(); 
			obj.setenglisg(e);
			
			System.out.println("Enter the history marks");
			his = s.nextFloat(); 
			obj.sethistory(his);
			
			System.out.println("Enter the computer marks");
			com = s.nextFloat(); 
			obj.setcomp(com);
			
			System.out.println("Enter the sports marks");
			sp = s.nextFloat(); 
			obj.setsports(sp);
			
			res = obj.compute();
			
			System.out.println("The result of "+ obj.name +"=" +res);
			
			System.out.println("Do you want to continue?");
			System.out.println("1 - Yes 2 - No");
			
			optn = s.nextInt();
			
		} while (optn == 1);
	}
}
