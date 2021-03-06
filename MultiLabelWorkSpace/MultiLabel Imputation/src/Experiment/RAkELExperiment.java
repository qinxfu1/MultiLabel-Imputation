package Experiment;

import Imputation.MissingValueGenerator;
import weka.classifiers.Classifier;
import weka.classifiers.trees.RandomForest;
import mulan.classifier.meta.RAkEL;
import mulan.classifier.transformation.LabelPowerset;
import mulan.data.MultiLabelInstances;
import mulan.evaluation.Evaluation;
import mulan.evaluation.Evaluator;

public class RAkELExperiment {

	public static Evaluation TryClassifer(Classifier classifer, MultiLabelInstances dataset, double ratio) throws Exception
	{
        MultiLabelInstances missingDataset = MissingValueGenerator.Create(dataset, ratio);
        RAkEL model = new RAkEL(new LabelPowerset(classifer));

        System.out.println("Building dataset");
        model.build(missingDataset);

        Evaluator evaluator = new Evaluator();
        return evaluator.evaluate(model, missingDataset);
	}
}
