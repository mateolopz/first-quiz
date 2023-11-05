# Security analysis

Given the caractheristics of the software and it's requeriments some of the most relevant OWASP categories to make the app more secure are:

## Injection:

Because the app handles transactional operations with a database engine and most probably with an ORM, is necessary that the application is protected against attacks of SQL injection in order to protect the users data. This can be achieved by ensuring a good use of inputs sanitizing as well as the use of parameters

## Broken authentication:

The application description mentions customers or users, who can be expected to have the need to authenticate in order to access all their information and services. With this in mind is imperative that all kind of processes that include authentication such as login or restricted requests have to be shielded against falsification attempts or brute force attacks so an user's info or resources are not affected. This can be avoided by implementing practices like not allowing weak passwords and by correctly implementing authentication techniques such as security tokens.

## Sensitive data exposure:

Given that there are 12 software engineers who have full access to the system and 3 customer support employees who may also have access to confidential information, it is really important to encrypt sensible data like passwords or bank account details with a strong algorithm such as RSA and following industry practices like using salt as well as using secure communication protocols like HTTPS whenever this or really any kind of info has to be sent from one place to another.

## Broken access control:

As with any other application this one will also have different types of privileges depending on the type of the user, for example the software engineers will have a broader set of privileges than the sales employee or a normal user, however this opens the door to a potential disaster if these privileges are not managed correctly or if an user somehow obtains a higher level access thanks to a bug or a flaw. This can be avoided with the implementation of control mechanisms and privileges checks.