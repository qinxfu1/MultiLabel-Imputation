package Imputation;

import java.util.ArrayList;

import mulan.data.MultiLabelInstances;

public class MissingValueMultiLabelDatasetMetaDataset {

	public MultiLabelInstances Dataset;
	public int NumberOfMissingLabels;
	public ArrayList<String> MissingLabels; //String Holds names of Labels with Missing values
	public ArrayList<String> ImputatedLabels; //String holds names of Labels with imputated Values
	public ArrayList<String> KnownLabels; //String holds names of labels with known values
}
