package exp_select;

import static java.lang.System.out;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import basic.DataCreator;
import basic.DataUpdator;

public class prepare_files {

	public static void main(String[] args) throws IOException {
		String program_start_date_time=new SimpleDateFormat("yyyy/MM/dd HH:mm:ssZ").format(Calendar.getInstance().getTime());
		long start=System.currentTimeMillis();
//		PrintWriter result_file= new PrintWriter(new FileWriter("data/result-selection.txt"));
		
		int num_lines = 15000000, 
		double per = 0.1,
			
			//create update lists
			String update_file_name="data/update_"+per+".txt";
			DataCreator.prepareUpdateList3(per, num_lines, update_file_name);
			out.println("\t update list created");
			
			//update tbat
			//DataUpdator.updateTBAT(tbat_file_name, update_file_name);
			//out.println("\t tbat updated (unclean)");
			
			//update bat
			//DataUpdator.updateBAT_BinarySearch(bat_file_name, update_file_name);
			//out.println("\t bat updated");
		}
		
		
		long end=System.currentTimeMillis();
		double elapsedTime=(end-start)/1000.0;
		out.println("Elapsed Time:"+elapsedTime+"s");
	}

}