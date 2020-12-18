package com.example.ddwildshapeguide;

import java.util.List;

public class Monster {
    public class Speed{
        public String walk;
        public String swim;
        public String fly;
    }

    public class Senses{
        public String darkvision;
        public int passive_perception;
    }

    public class DcType{
        public String name;
        public String url;
    }

    public class Dc{
        public DcType dc_type;
        public int dc_value;
        public String success_type;
    }

    public class SpecialAbility{
        public String name;
        public String desc;
        public Dc dc;
    }

    public class DamageType{
        public String name;
        public String url;
    }

    public class Damage{
        public DamageType damage_type;
        public String damage_dice;
        public int damage_bonus;
    }

    public class Usage{
        public String type;
        public int times;
    }

    public class Action{
        public String name;
        public String desc;
        public int attack_bonus;
        public Dc dc;
        public List<Damage> damage;
        public Usage usage;
    }

    public class LegendaryAction{
        public String name;
        public String desc;
        public int attack_bonus;
        public List<Damage> damage;
    }
    public class Proficiencies {
        public int value;
        public Proficiency proficiency;
    }
    public class Proficiency{
        public String index;
        public String name;
        public String url;
    }
        public String index;
        public String name;
        public String size;
        public String type;
        public Object subtype;
        public String alignment;
        public int armor_class;
        public int hit_points;
        public String hit_dice;
        public Speed speed;
        public int strength;
        public int dexterity;
        public int constitution;
        public int intelligence;
        public int wisdom;
        public int charisma;
        public List<Proficiencies> proficiences;
        public List<Object> damage_vulnerabilities;
        public List<Object> damage_resistances;
        public List<Object> damage_immunities;
        public List<Object> condition_immunities;
        public Senses senses;
        public String languages;
        public int challenge_rating;
        public List<SpecialAbility> special_abilities;
        public List<Action> actions;
        public List<LegendaryAction> legendary_actions;
        public String url;
    }

