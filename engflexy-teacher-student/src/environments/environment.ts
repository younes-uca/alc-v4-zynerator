const url = 'http://localhost:8036';
const socket = 'http://localhost:8088/';
export const environment = {
    production: false,
    AUTH_URL: url,
    BASE_URL: url + '/learn/',
    ADMIN_URL: url + '/admin/',
    TEACHER_URL: url + '/prof/',
    STUDENT_URL: url + '/etudiant/',
    PUBLIC_URL: url + '/public/',
    SOCKET_URL: socket,
    sectionItemUrl: url + '/learn/sectionItem/',
    translationHost: url + '/learn/TranslateEnAr/text/translationFeatures/',
};
