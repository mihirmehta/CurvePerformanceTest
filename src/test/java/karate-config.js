function fn() {    
  
  var apiKey = karate.properties['apiKey'];
  var config = {
  apiKey: '9e2ea912118d44acbe0115456200703',
  weather_7day_api: 'http://api.weatherapi.com/v1/history.json'
  };
  
  return config;
  
  karate.configure('report', { showLog: true, showAllSteps: false });
  
  
}