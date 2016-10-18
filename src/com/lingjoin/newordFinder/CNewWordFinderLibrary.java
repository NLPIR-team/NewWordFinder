package com.lingjoin.newordFinder;

import com.sun.jna.Library;
import com.sun.jna.Native;

public interface CNewWordFinderLibrary extends Library {

	CNewWordFinderLibrary Instance=(CNewWordFinderLibrary) Native.loadLibrary("NewWordFinder", CNewWordFinderLibrary.class);
	
	public int NWF_Init(String sDataPath,int encode,String sLicenceCode);
	
	public String NWF_GetNewWords(String sLine,int nMaxKeyLimit,boolean bWeightOut);
	
	public String NWF_GetFileNewWords(String sFilename,int nMaxKeyLimit,boolean bWeightOut);
	
	public int NWF_Batch_Start();
	
	public int NWF_Batch_AddFile(String sFilename);
	
	public int NWF_Batch_AddMem(String sText);
	
	public int NWF_Batch_Complete();
	
	public String NWF_Batch_GetResult(boolean bWeightOut);
	
	public int NWF_Result2UserDict();
	
	public String  NWF_GetLastErrorMsg();
	
	public boolean NWF_Exit();
}
