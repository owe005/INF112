# Tests 

# Player Test
***
* Test Player Spawn
  * Steps to reproduce
    * Start up new game
    * See that Player is on the map
  * Expected
    * One can see the Player on the screen
  * Result
    * Player have spawned and is on the screen
***

* Test Player Movement
  * Steps to reproduce
    * Start up game
    * Press either W,A,D to see the Player movement
  * Expected
    * Left = KeyCode.A
      - If you press the keycode "A" Player moves towards left
      - PLayer moves to left.
    * Right = KeyCode.D
      - If you press the keycode "D" Player moves towards right
      - Player moves to right
    * Jump = KeyCode.W
      - If you press the keycode "W" Player jumps
      - Player jumps
    * Stop
      - If you stop pressing any of the keycodes the player stops moving
      - Player stops moving
***

* Test if player can attack
  * Steps to reproduce
    * Start up game
    * Click on the mouse
  * Expected
    * If you click on the mouse the Player attacks
    * Player attacks
***

* Test if player is dead
  * Steps to reproduce
    * Start up game
    * Take 100 damage
  * Expected
    * If player has 0 health
    * Player is dead
***

* Test if player is outside of the map
  * Steps to reproduce
    * Start up game
    * Walk out of the map
  * Expected
    * If player is moves outside of the map
    * Player is outside of the map
***

* Test Player health
  * Steps to reproduce
    * Start up game
    * check health
  * Expected
    * Player health
    * 100
***

* Test Player respawn
  * Steps to reproduce
    * Start up game
    * Jump out of the map
    * Check if player respawns
  * Expected
    * If player dies, it will respawn
    * Player respawns
***

* Test New Level
  * Steps to reproduce
    * Start up game
    * Finish the level
    * Spawn to the next level
  * Expected
    * Player will spawn in a new level
    * New Level


# Zombie Test
***
* Test Zombie Spawn
  * Steps to reproduce 
    * start up new game
    * see that zombies are on the map (have same model as player for now)
  * expected
    * one can see Zombies on the map
  * result 
    * Zombies have spawned and is on the map 
***
* Test Zombie Movement
  * steps to reproduce 
    * start up game
    * find a zombie 
    * see that it moves left / right on interval 
  * expted 
    * the zombie(s) move left and right 

***

* Test if Zombie can attack
  * steps to reproduce
    * start up game 
    * find a zombie 
    * walk into it
  * expectecd
    * you take damage that is shown in the HP bar top left corner 
  * result 
    * Takes damage that is show in hp bar 

***

* Test if Zombie is dead
  * steps to reproduce
    * start up game 
    * find a zombie
    * attack it 
  * expected 
    * the zombie will despawn and is now dead 
  * result 
    * the Zombie despawned and is dead.


# Object Test
* Test Player interreaction with wall
  * Steps 
    * start up new game
    * find a wall 
    * jump into it 
    * walk into it 
    * jump ontop of it 
  * Expted 
    * on jump into it: should slide down
    * on walk into it: should collide and not move through it 
    * on jump ontop: should be able to stand on it.
  * result 
    * jump: slides down 
    * walk: stops on colide 
    * jump: is able to stand ontop 
*** 
* Test Zombie interreaction with wall
  * Steps:
    * start game 
    * find zombie 
    * watch it walk into a wall
  * Expected 
    * when a Zombie walks into a wall it does not walk through it and stops in its tracks.
  * result 
    * the zombie stops when it hits a wall and does not walk through it 
  
*** 
* Test Player interreaction with ground
  * steps 
    * Start up game 
    * observe player does not fall through the ground
  * Expected 
    * The player should remain on the ground and not fall through 
  * result 
    * the player does not fall thorugh the ground.

***
  
* Test Zombie interreaction with ground
  * steps
    * Start up game
    * find A zombie 
    * observe Zombie does not fall through the ground
  * Expected
    * The Zombie should remain on the ground and not fall through
  * result
    * the Zombie does not fall through the ground.

*** 
* Test CoinHandler
  * steps
    * start up a new game 
    * move into a coin (big yellow circle model)
  * Expected
    * coin is removed from world and player gets a coin.
  * result 
    * player gets a coin on collision with a coin object

*** 
* Test DoorHandler for new level
  * steps
    * start up a game
    * Keep moving the player to the right side of the gameworld 
  * Expected 
    * at some point the screen should fade to black and Player object will enter new world 
  * result 
    * tirggers the doorhandler and moves the player to new world.

# Menu Test
* Test starting game
  * Steps to reproduce
    * Start up game through GameApp.java
  * Expected
    * After running GameApp, the game will start
    * The game will run

*** 
* Test Main Menu
  * Steps to reproduce
    * Start up game
    * The main menu will show up
  * Expected
    * After running the game, the main menu will show up
    * Main menu

*** 
* Test Game Menu
  * Steps to reproduce
    * Start up game
    * Press "ESC" to get the game menu
  * Expected
    * After running the game, and pressing "ESC" the game menu will show up
    * Game menu

