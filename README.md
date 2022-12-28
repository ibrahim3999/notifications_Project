![](https://media.tenor.com/cF4jU_6_CnUAAAAi/piggy-regret.gif)



# notifications_Project
The project implements above group admin that updates
platform of messages for group members.


## Authors

- [@ibrahim3999](https://github.com/ibrahim3999)
- [@Tairsal](https://github.com/Tairsal)





## Project Description
### API Interfaces:
 - [Sender](https://github.com/ibrahim3999/notifications_Project/blob/main/src/main/java/api/Member.java)
 - [Member](https://github.com/ibrahim3999/notifications_Project/blob/main/src/main/java/api/Sender.java)
 
### Group Admin
A class that implements the Sender Interface also include Insert,
Delete , Append and Undo Methods.(total Momery 288)

- [Methods](https://github.com/ibrahim3999/notifications_Project/blob/main/src/main/java/observer/GroupAdmin.java)

```
Group Admin & Concrete Member
Both of these use observer design patterns :)
```


### Concrete Member
A class that implements the Member Interface and extends Group Admin also include update platform
for any changes in the Group Admin.(total Momery 184)

- [update platform](https://github.com/ibrahim3999/notifications_Project/blob/main/src/main/java/observer/ConcreteMember.java)

### UndoAbleStringBuilder
Class that include A stack Memory (without limit) for any change
 in the message.

- [Allocate Memory for Changes](https://github.com/ibrahim3999/notifications_Project/blob/main/src/main/java/observer/UndoableStringBuilder.java)
## UML 
![notifications_Project-main-UML-DIAGRAM](https://user-images.githubusercontent.com/73761096/209674671-2561fbae-cad1-4e2a-af34-9db182ebb747.png)
## Run project

Clone the project

```bash
  link clone https://github.com/ibrahim3999/notifications_Project.git
```



## 🚀 About Us
We are Computer Science Students in Ariel University

