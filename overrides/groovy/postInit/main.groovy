
println('Hello GuildZ.')
import globals.Globals
def LCR = recipeMap('large_chemical_reactor');

LCR.recipeBuilder()
   .fluidInputs(fluid('water') * 1)
   .fluidOutputs(fluid('lava') * 1)
   .EUt(480)
   .duration(200)
   .buildAndRegister();
