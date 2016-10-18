package com.lingjoin.newordFinder;

public class NewWordFinder {

	public static int state=0;
	
	public static int init(String arg){
		state=CNewWordFinderLibrary.Instance.NWF_Init(arg, 1, null);
		return state;
	}
	
	public static String getNewWords(String sLine,int nMaxKeyLimit,boolean bWeightOut){
		if(state==1){
			return CNewWordFinderLibrary.Instance.NWF_GetNewWords(sLine, nMaxKeyLimit, bWeightOut);
		}else
			return null;
	}
	
	public static String getFileNewWords(String sFilename,int nMaxKeyLimit,boolean bWeightOut){
		if(state==1)
			return CNewWordFinderLibrary.Instance.NWF_GetFileNewWords(sFilename, nMaxKeyLimit, bWeightOut);
		else
			return null;
	}
	
	public static int batchStart(){
		if(state==1)
			return CNewWordFinderLibrary.Instance.NWF_Batch_Start();
		else
			return 0;
	}
	
	public static int batchAddFile(String sFilename){
		if(state==1)
			return CNewWordFinderLibrary.Instance.NWF_Batch_AddFile(sFilename);
		else
			return 0;
	}
	
	public static int batchAddMem(String sText){
		if(state==1)
			return CNewWordFinderLibrary.Instance.NWF_Batch_AddMem(sText);
		else
			return 0;
	}
	
	public static int batchComplete(){
		if(state==1)
			return CNewWordFinderLibrary.Instance.NWF_Batch_Complete();
		else
			return 0;
	}
	
	public static String batchGetResult(boolean bWeightOut){
		if(state==1)
			return CNewWordFinderLibrary.Instance.NWF_Batch_GetResult(bWeightOut);
		else
			return null;
	}
	
	public static int result2UserDict(){
		if(state==1)
			return CNewWordFinderLibrary.Instance.NWF_Result2UserDict();
		else
			return 0;
	}
	
	public static String getLastErrorMsg(){
		return CNewWordFinderLibrary.Instance.NWF_GetLastErrorMsg();
	}
	
	public static boolean exit(){
		return CNewWordFinderLibrary.Instance.NWF_Exit();
	}
}
