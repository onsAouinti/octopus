package com.sfeir.octopus.back.client.activity;



import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;
import com.sfeir.octopus.back.client.mvp.HasPlace;
import com.sfeir.octopus.back.client.place.UsersPlace;
import com.sfeir.octopus.back.client.ui.users.UsersView;

public class UsersActivity extends AbstractActivity implements HasPlace, UsersView.Presenter {

	@Inject
	private UsersView view;

	@Inject
	private PlaceController placeController;

	private UsersPlace place;

	@Override
	public void start(final AcceptsOneWidget panel, final EventBus eventBus) {
		view.setPresenter(this);
		panel.setWidget(view.asWidget());
	}

	@Override
	public void goTo(final Place place) {
		placeController.goTo(place);
	}

	@Override
	public Activity setPlace(final Place place) {
		this.place = (UsersPlace) place;
		return this;
	}

}
