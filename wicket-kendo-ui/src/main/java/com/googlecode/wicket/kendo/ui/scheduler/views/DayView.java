package com.googlecode.wicket.kendo.ui.scheduler.views;


/**
 * Defines the 'day' scheduler's view
 *
 * @author Patrick Davids - Patrick1701
 *
 */
public class DayView extends SchedulerView
{
	private static final long serialVersionUID = 1L;

	/**
	 * Gets a new instance of <tt>DayView</tt>
	 *
	 * @return a new {@link DayView}
	 */
	public static DayView newInstance()
	{
		return new DayView();
	}

	/**
	 * Constructor
	 */
	private DayView()
	{
		super(SchedulerViewType.day);
	}

	@Override
	public SchedulerView setDateHeaderTemplatePattern(String pattern)
	{
		return super.setDateHeaderTemplatePattern(pattern);
	}
}
