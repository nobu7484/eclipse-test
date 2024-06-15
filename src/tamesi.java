import java.util.Calendar;
import java.util.Date;

public class tamesi {
	 public static void main(String[] args) {
		
		        // Calendarインスタンスを取得
		        Calendar c = Calendar.getInstance();
		        
		        // 年を設定
		        c.set(Calendar.YEAR, 2024);
		        // 月を設定
		        c.set(Calendar.MONTH, Calendar.MAY); // 月は0から始まるため、5月はCalendar.MAY
		        // 日を設定
		        c.set(Calendar.DAY_OF_MONTH, 17);
		        // 時を設定
		        c.set(Calendar.HOUR_OF_DAY, 10); // 24時間形式で設定
		        // 分を設定
		        c.set(Calendar.MINUTE, 30);
		        // 秒を設定
		        c.set(Calendar.SECOND, 0);
		        
		        // CalendarオブジェクトからDateインスタンスを取得
		        Date d = c.getTime();
		        
		        // 設定した日時を表示
		        System.out.println(d);
		    }
		}