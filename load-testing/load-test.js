import http from 'k6/http';

export let options = {
    vus: 250,
    duration: '10m'
};

export default function () {

    const payload = JSON.stringify({
        transactionId: `TXN-${Date.now()}-${__VU}-${__ITER}`,
        senderId: "USER1",
        receiverId: "USER2",
        amount: 100.50,
        currency: "USD"
    });

    const params = {
        headers: {
            'Content-Type': 'application/json'
        }
    };

    http.post(
        'http://localhost:8081/v1/payments',
        payload,
        params
    );
}