package com.KarateGatlingDemo

import com.intuit.karate.gatling.PreDef._
import io.gatling.core.Predef._
import scala.concurrent.duration._
import io.gatling.http.Predef._

class TestSimulation extends Simulation {

  //The scenario is the scenario name in the feature file. 
  val getHottestColdest = scenario("Get the hottest day and coldest day of the week").exec(karateFeature("classpath:com/KarateGatlingDemo/WeeklyWeather_LA.feature"))

  //End point defined in the feature file will have 30 users hitting the endpoint in 20 secs
  setUp(
    getHottestColdest.inject(rampUsers(30) during (20 seconds)))

}