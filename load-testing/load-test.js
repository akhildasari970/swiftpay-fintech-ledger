import http from 'k6/http';

export let options = {
  vus: 50,
  duration: '1m'
};

export default function () {
  http.get('http://localhost:8083/actuator/health');
}

//import http from 'k6/http';
//export default function () {
//  http.get('http://localhost:8081/actuator/health');
//}
