package me.StevenLawson.TotalFreedomMod.Commands;

public enum AdminLevel
{
    ALL("All Player Commands"), OP("OP Commands"), SUPER("SuperAdmin Commands"), BUILDER("Builder Commands"), SENIOR("Senior Admin Commands");
    //
    private final String friendlyName;

    private AdminLevel(String friendlyName)
    {
        this.friendlyName = friendlyName;
    }

    public String getFriendlyName()
    {
        return friendlyName;
    }
}
