package listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import retry.Retry;

public class RetryListener implements IAnnotationTransformer {
	public void transform(final ITestAnnotation annotation, final Class testClass, final Constructor testConstructor,
			final Method testMethod) {
		annotation.setRetryAnalyzer(Retry.class);
		
		//IAnnotationtannotation represent the annotation of the current test method
		//IAnnotationTransformer is a inbuilt interface
		
	}

}
