
println('Hello GuildZ.')
import globals.Globals
def LCR = recipeMap('large_chemical_reactor');

LCR.recipeBuilder().EUt(480).duration(200)
   .fluidInputs(fluid('water') * 1)
   .fluidOutputs(fluid('lava') * 1)
   .buildAndRegister()
