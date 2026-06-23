package org.pvp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testExternalApi() {

        // Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Inject mock into service
        MyService service = new MyService(mockApi);

        // Call service method
        String result = service.fetchData();

        // Verify result
        assertEquals("Mock Data", result);
    }
    @Test
    public void testAnotherMockValue() {

        ExternalApi mockApi = mock(ExternalApi.class);

        when(mockApi.getData()).thenReturn("CTS Deep Skilling");

        MyService service = new MyService(mockApi);

        String result = service.fetchData();

        assertEquals("CTS Deep Skilling", result);
    }
    @Test
    public void testVerifyInteraction() {

        // Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Create service
        MyService service = new MyService(mockApi);

        // Call service method
        service.fetchData();

        // Verify interaction
        verify(mockApi).getData();
    }
    @Test
    public void testVerifyCalledOnce() {

        ExternalApi mockApi = mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        service.fetchData();

        verify(mockApi, times(1)).getData();
    }
}