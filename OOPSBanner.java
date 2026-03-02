public class OOPSBanner {

    static class CharacterPatternMap {

        private Character character;
        private String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap[] charMaps = new CharacterPatternMap[4];

        String[] O =       {"   ***   ",
                            " **   ** ",
                            "**     **",
                            "**     **",
                            "**     **",
                            " **   ** ",
                            "   ***   "

        };


        String[] P =        {" ******  ",
                             " *    *  ",
                             " ******  ",
                             " *       ",
                             " *       ",
                             " *       ",
                             " *       "

        };

        String[] S =        {"   ***   ",
                             " **      ",
                             "  **     ",
                             "    ***  ",
                             "       **",
                             " **    **",
                             "   ***   "

        };


        String[] SPACE = {
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   ",
                "   "
        };

        charMaps[0] = new CharacterPatternMap('O', O);
        charMaps[1] = new CharacterPatternMap('P', P);
        charMaps[2] = new CharacterPatternMap('S', S);
        charMaps[3] = new CharacterPatternMap(' ', SPACE);

        return charMaps;
    }
     
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        
        return getCharacterPattern(' ', charMaps);
    }
     
    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        int height = 7; 

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < message.length(); j++) {

                String[] pattern = getCharacterPattern(message.charAt(j), charMaps);
                System.out.print(pattern[i] + "  ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}