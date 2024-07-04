package com.alxvn.backlog.behavior;

import com.alxvn.backlog.dto.BacklogDetail;

public interface BacklogBehavior {

	public String resolveTarget(BacklogDetail bd);
}
