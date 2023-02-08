class Player():
    def __init__(self,name,magic_type):
        self.name = name
        self.magic_type = magic_type

    def introduce(self):
        print(f"Hi I am {self.name},I am a {self.magic_type}")

class Wizard(Player):
    def __init__(self,name,magic_type):
        super().__init__(name,magic_type)

    def play(self):
        print(f"WEEEEEEE I am a {self.magic_type}")

wizard1 = Wizard("Shelly","Healer")
wizard1.introduce()
wizard1.play()