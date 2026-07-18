package week7.day1.StaticParametrizationCucumber.runner;

import io.cucumber.testng.CucumberOptions;
import week7.day1.StaticParametrizationCucumber.stepDefinition.BaseClassStaticCucumber;

@CucumberOptions(features= {"week7/day1/StaticParametrizationCucumber/features/editAccountStaticCucumber.feature"},
glue="week7.day1.StaticParametrizationCucumber.stepDefinition",
publish=true, 
tags="@EditAccount")

public class RunnerStaticCucumber extends BaseClassStaticCucumber{

}