                                                  # CurvePerformanceTest
                    
This repository is for running an example of performance tests that come integrated with the Karate framework. Karate has a seemless integration with Gatling.

For understanding purposes, I have created a seperate repository for performance tests otherwise the same feature files that we have as part of our API tests can be used for the performance tests as well.

In this example, we are using the same feature file that determines the hottest and coldest date in the last 7 days in Los Angeles. The endpoint under test is the history api from weatherapi.com, the same as our backend tests.

I have used scala to write the simulation file which is very simple to understand. We need to have maven installed to execute the tests.

To run this performance test, clone the repo, go into the cloned directory and give the following command:

mvn clean test-compile gatling:test

The karate-config.js file is where the end points are defined. I have intentionally added the apiKey in this file just for demo purposes. In reality, the apiKey can be configured to be picked up from the CI/CD config parameters.

The reports are generated and stored under \target\gatling folder. I have intentionally pushed this folder in the repo from my local repo which has an already generated report for reference. 
