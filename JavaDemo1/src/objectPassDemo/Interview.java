package objectPassDemo;
import java.util.*;
enum Days{
	Monday,Tuesday,Wednesday,Thursday,Friday
}
public class Interview {
	String cname,cid, qualification,year;
	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
	Days MeetingDate;
	
	public void getDetails() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Candidate Name  				: ");
		cname = in.nextLine();
		System.out.print("Enter Candidate Id                    : ");
		cid = in.nextLine();
		System.out.print("Enter Candidate Qualification         : ");
		qualification = in.nextLine();
		System.out.print("Enter Candidate Year of Qualification : ");
		year = in.nextLine();
		System.out.print("Please choose the Interview Day       : ");
		System.out.println();
		int j=1;
		for(Days i: Days.values()) {
			System.out.println(j +"--> "+i);
			j++;
		}
		int ch = in.nextInt();
		switch(ch){
			case 1:
				MeetingDate = Days.Monday;
				break;
			case 2:
				MeetingDate = Days.Tuesday;
				break;
			case 3:
				MeetingDate = Days.Wednesday;
				break;
			case 4:
				MeetingDate = Days.Thursday;
				break;
			case 5:
				MeetingDate = Days.Friday;
				break;
			default:
				System.out.println("Invalid Entry...");
		}
		
	}
	
	public void putDeatails() {
		System.out.println("Candidate Name..................: "+ cname);
		System.out.println("Candidate Id....................: "+ cid);
		System.out.println("Candidate Qualification.........: "+ qualification);
		System.out.println("Candidate Year of Qualification.: "+ year);
		System.out.println("Interview Day.............: "+ MeetingDate);
		System.out.println();
	}
	public static void main(String [] args) {
		
		Interview ad[] = new Interview[5];
		for(int i=0;i<ad.length;i++) {
			ad[i] = new Interview();
			ad[i].getDetails();
		}

		for(int i=0;i<ad.length;i++) {
			ad[i].putDeatails();
		}
		
		
	}

}
