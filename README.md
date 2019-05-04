
## Team Name- Westeros

## Team Members

* [Jai Chhatre](https://github.com/c-jai)
* [Mrunali Sanjay Khandat](https://github.com/monakhandat)
* [Mugdha Wadikar](https://github.com/Mugdha001)
* [Nikhil Limaye](https://github.com/NikhilLimaye/)

## Game: Battle of Winterfell
The game is inspired by the TV show "Game of Thrones". 
Jon Snow (Player) is the protector of the castle. He fights the white walkers (Enemy) and wants to protect his home. In this game, the health of castle decreases in proportion to the bullets hit. Jon absorbs the ice bullets, fired by the enemy, to protect the castle. He keeps navigating around the castle until all white walkers are killed. He fires his own bullets at the white walkers to defeat them. The player can fire 3 different types of weapons- default bullets, fire bullets (acquired after collecting Fire Bullet Bonus) and dragon glass daggers (acquired after collecting Dragon Glass Bonus). These Bonus Coins appear at a particular stage in the game - Fire Bullet Bonus coin appears when castle health drops below 60 and Dragon Glass Bonus coin appears when it drops below 40. On finishing one level, he moves to the next level. In level 2 and 3, gameplay remains similar with the difficulty level increases where number of white walkers to kill increases along with the speed of their bullets. Finishing level 3 completes the game and Jon wins. Score is updated based on the number of bullet hits on the castle and the number of white walkers killed by the player. The player loses the game when castle's health drops down to 0.

## Project Description
The entire game has been developed in Greenfoot 3.5.3. All coding done from scratch with no existing frameworks. 
We identified the following patterns and integrated them into the game - 

1. Factory Method  - To create objects of the appropriate weapon.  
2. Observer  - To notify the scoreboard according to hits on the enemy and the castle. Bonus coins also appear based on changes in castle health.  
3. Command  - To implement Bonus Menu with options- keys a, s, d for corresponding weapons/ bonuses (Default Bullet, DragonGlass, Fire Bullet).  
4. Strategy  - To implement change in attack strategy of the player (Single and Double strength bullets) depending on castle health.
5. Mediator  - Decoupling of the World Object with Actor objects to have loose coupling betweeen them.
6. Prototype - Cloning objects - here, trees in the game are cloned as per the type specified by the client(MyWorld), and not create brand new objects.


## Project Progress
[Task board](https://docs.google.com/spreadsheets/d/1DSEwbavSd_8pse69NMivcuutHHYLBUjinzsDAwG56OA/edit?usp=sharing)

### Burndown Map

### Project Dashboard  
https://github.com/nguyensjsu/sp19-202-westeros/projects/1

### Individual Contributions
#### 1. Nikhil Limaye
 - Contributed to the design of the overall concept of the game. 
 - Design of players, characters, layout, key presses and basic screen orientation
 - Created UI mockups for the same.
 - Contributed to designing different levels of the game
 - Coded transition of the game using transition screens
 - As a champion of the XP value "Simplicity", I suggested various improvements to keep the code clean and simple. Improvements that 
   would help us maintain the code better and easier to extend
 - Design and coding of the Observer pattern to handle the ScoreBoard actor. 
 - UML Diagrams for the Observer Pattern
 - Created the 1 minute promo video for the game
 - User stories completed
   1. As a player, I should be able to see the opponents on startup
   2. As a player, enemy health should go down by 5% on a hit. Castle health should also go down by 5% on hit


#### 2. Jai Chhatre
- Participated in early discussions to decide the idea behind the game. Contributed to designing the game features.
- Significantly contributed in finalizing class design and creating a class diagram for the entire project.
- Participated in creation of user stories, their distribution and documentation.
- Implemented feature where the player can move and collect the bonus coins. After collecting the bonus coins, they should disappear.
- Implemented feature where the collected bonuses and available weapon options are displayed as a "Bonus/ Weapon Menu".
- Created Sequence diagram for use case: Collect Bonus coins and use them.
- Contributed to creating the power point presentation for the final demo.
- Implemented Mediator pattern to decouple actors and world classes.
- Implemented Command pattern for providing a Bonus/ Weapon menu to the player. Based on the keyboard keys pressed by the player, menu options of default bullets, fire bullets and dragon glass daggers are selected and the player uses the updated weapon factory to continue firing.
- Implemented Prototype pattern to simplify creation of tree objects based on their size.
- Created UML class diagrams for the implemented patterns(Mediator, Command, Prototype).
- Created custom images for various actors like DragonGlassBonus, FireBulletBonus, Castle etc.
- Refactored code extensively, added API documentation and helpful comments for the entire code base.
- Championed the "Feedback" value of XP. Throughtout the game's implementation, I was responsible for encouraging team members to focus on the decided features and closely monitoring the progress of every weekly iteration. I ensured that every feature was demonstrated early, that any change/correction suggested to those features was made in time and that the entire project was delivered in a timely manner.

#### 3. Mugdha Wadikar
#### 4. Mrunali Khandat

### Link to Promo Video  
https://www.youtube.com/watch?v=-KmXbH8_Xe4 

### Individual Scrum Journals
Mrunali Sanjay Khandat - https://github.com/nguyensjsu/sp19-202-westeros/blob/master/MrunaliKhandat-Journal.MD  
Nikhil Limaye - https://github.com/nguyensjsu/sp19-202-westeros/blob/master/NikhilLimaye-Journal.md  
Mugdha Wadikar - https://github.com/nguyensjsu/sp19-202-westeros/blob/master/MugdhaWadikar-Journal.md  
Jai Chattre - https://github.com/nguyensjsu/sp19-202-westeros/blob/master/JaiChhatre.md  
